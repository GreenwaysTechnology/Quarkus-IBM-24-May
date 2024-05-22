package com.ibm.quarkus.rest.threading;

import com.ibm.quarkus.responses.entity.Product;
import io.smallrye.common.annotation.Blocking;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.time.Duration;
import java.util.List;

@Path("blocking")
public class BlockingEventLoopThreadResource {

    @GET
    @Blocking
    public Uni<Response> getResponse() throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        List<Product> products = List.of(
                new Product(1, "Tooth Paste", 1233.00),
                new Product(2, "Too brush", 123.00),
                new Product(3, "Shaving cream", 500.00),
                new Product(1, "Soap", 340.00));

        //inject blocking code
        //Thread.sleep(1000);
        Thread.sleep(5000);

        return Uni.createFrom().item(products)
                .onItem()
                .transform(f -> Response.ok(f).header("message", "Products"))
                .onItem()
                .transform(Response.ResponseBuilder::build);
    }
    @GET
    @Path("reactivescheduler")
    public Uni<Response> getResponseWithDelay() throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        List<Product> products = List.of(
                new Product(1, "Tooth Paste", 1233.00),
                new Product(2, "Too brush", 123.00),
                new Product(3, "Shaving cream", 500.00),
                new Product(4, "Soap", 340.00));

        return Uni.createFrom().item(products)
                .onItem()
                .transform(f -> Response.ok(f).header("message", "How are you"))
                .onItem()
                .delayIt().by(Duration.ofMillis(6000))
                .onItem()
                .transform(Response.ResponseBuilder::build);
    }
}
