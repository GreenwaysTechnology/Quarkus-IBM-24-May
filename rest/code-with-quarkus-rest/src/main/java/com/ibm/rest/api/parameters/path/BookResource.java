package com.ibm.rest.api.parameters.path;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("books")
public class BookResource {
    //books by id
    @GET
    @Path("{id}")
    public String findById(@PathParam("id") Integer id) {
        return "findbyId " + id ;
    }
}
