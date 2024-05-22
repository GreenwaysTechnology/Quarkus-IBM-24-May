package com.ibm.quarkus.rest.threading;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("workerthread")
public class BlockingThreadingResource {
    @GET
    public String getInfo(){
        System.out.println(Thread.currentThread().getName());
        return "Info";
    }
}
