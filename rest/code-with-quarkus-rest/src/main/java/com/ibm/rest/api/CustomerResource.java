package com.ibm.rest.api;

import jakarta.ws.rs.*;

@Path("customers")
public class CustomerResource {

    //apis
    @GET
    public String findAll(){
        return  "Customers-FindAll";
    }

    @GET
    @Path("reviews")
    public String getReviews(){
        return "Customers Review";
    }
    @POST
    public String save(){
        return  "Customers-save";
    }
    @PUT
    public String update(){
        return "Customers-update";
    }
    @DELETE
    public String remove(){
        return  "Customers-Remove";
    }
}
