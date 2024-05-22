package com.ibm.quarkus.responses.exceptions;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.WebApplicationException;

@Path("exception")
public class ExceptionResource {

    @GET
    public String getResponse(@QueryParam("name") String name) {
        if(name.equals("admin")){
            return "Hello";
        }
        throw new WebApplicationException("Something went wrong-Invalid Name");
    }
}
