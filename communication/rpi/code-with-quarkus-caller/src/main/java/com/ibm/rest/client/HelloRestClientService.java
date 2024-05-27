package com.ibm.rest.client;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("hello")
//@RegisterRestClient
@RegisterRestClient(configKey = "hello-api")
public interface HelloRestClientService {
    //declare callee rest api specification
    @GET
    String sayHello();

    //reactive api
    @GET
    @Path("reactive")
    Uni<String> sayHai();
}
