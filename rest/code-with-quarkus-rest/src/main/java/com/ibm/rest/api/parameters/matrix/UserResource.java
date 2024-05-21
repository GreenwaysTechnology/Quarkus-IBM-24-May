package com.ibm.rest.api.parameters.matrix;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.MatrixParam;
import jakarta.ws.rs.Path;

@Path("users")
public class UserResource {

    @GET
    public String getUserInfo(@MatrixParam("city") String city,@MatrixParam("state") String state){
        return city + state;
    }
}
