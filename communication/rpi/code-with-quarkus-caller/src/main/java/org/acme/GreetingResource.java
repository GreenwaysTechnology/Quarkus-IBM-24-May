package org.acme;

import com.ibm.rest.client.HelloRestClientService;
import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/welcome")
public class GreetingResource {
    @Inject
    @RestClient
    HelloRestClientService helloRestClientService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return helloRestClientService.sayHello();
    }

    @GET
    @Path("hai")
    public Uni<String> haii() {
        return helloRestClientService.sayHai();
    }
}
