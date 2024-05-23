package com.ibm.cdi.service.lifecycles;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("users")
public class UserResource {

    @Inject
    UserService userService;

    //    @GET
//    public List<String> getUsers(){
//        return  userService.geUsers();
//    }
    @GET
    public Uni<List<String>> getUsers() {
        return userService.geUsers();
    }
}
