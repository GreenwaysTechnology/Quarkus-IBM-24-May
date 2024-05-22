package com.ibm.quarkus.responses;

import com.ibm.quarkus.responses.entity.Product;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("products")
public class ProductResource {

    @GET
    public Response getProducts() {
        List<Product> products = List.of(new Product(1, "Tv", 340000.00));
        return Response.ok().header("company", "IBM").entity(products).build();
    }

    @DELETE
    public void remove(){
        System.out.println("Removed");
    }
}
