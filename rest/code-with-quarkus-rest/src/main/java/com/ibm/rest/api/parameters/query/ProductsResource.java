package com.ibm.rest.api.parameters.query;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("products")
public class ProductsResource {

    //localhost:8080/products?qty=100&price=9000
    @GET
    @Path("filter")
    public String getProducts(@QueryParam("qty") @DefaultValue("0") Integer qty , @QueryParam("price")  @DefaultValue("0") Double price){
        return  "Products Qty :" + qty + " Price " + price;
    }
}
