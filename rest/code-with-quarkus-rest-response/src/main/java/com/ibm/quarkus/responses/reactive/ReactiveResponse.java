package com.ibm.quarkus.responses.reactive;

import com.ibm.quarkus.responses.entity.Product;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("reactive")
public class ReactiveResponse {
    @GET
    public Uni<List<Product>> getProductsAsync() {
        System.out.println(Thread.currentThread().getName());
        List<Product> products = List.of(
                new Product(1, "Tooth Paste", 1233.00),
                new Product(2, "Too brush", 123.00),
                new Product(3, "Shaving cream", 500.00),
                new Product(1, "Soap", 340.00));
        return Uni.createFrom().item(products);
    }
    @GET
    @Path("response")
    public Uni<Response> listProducts() {
        System.out.println(Thread.currentThread().getName());
        List<Product> products = List.of(
                new Product(1, "Tooth Paste", 1233.00),
                new Product(2, "Too brush", 123.00),
                new Product(3, "Shaving cream", 500.00),
                new Product(1, "Soap", 340.00));

        return Uni.createFrom()
                .item(products)
                .onItem()
                .transform(products1 -> Response.ok(products1).header("message", "products"))
                .onItem()
                .transform(Response.ResponseBuilder::build);

    }
}
