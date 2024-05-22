package com.ibm.quarkus.responses.objects;

import com.ibm.quarkus.responses.entity.Order;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("orders")
public class OrderResource {

    @Path("single")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Order getSingleOrder() {
        return new Order(1, "Pending", 34.56);
    }

    //collection
    @GET
    public List<Order> orders() {
        return List.of(
                new Order(1, "PENDING", 1000.45),
                new Order(2, "CREATED", 444.4),
                new Order(3, "DISPATCHED", 344.89),
                new Order(4, "TRANSIT", 3434.90),
                new Order(5, "CANCELLED", 1000.45));
    }
}
