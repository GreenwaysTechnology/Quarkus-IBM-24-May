package com.ibm.quarkus.rest.threading;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("nonblockingThread")
public class NonBlockingThreadingResource {

    @GET
    public Uni<String> getInfo() {
        System.out.println(Thread.currentThread().getName());
        return Uni.createFrom().item("Hello");
    }
}
