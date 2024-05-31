package org.acme;

import io.quarkus.logging.Log;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

@Path("/hello")
public class GreetingResource {
   // private static final Logger LOG = Logger.getLogger(GreetingResource.class);
   @Inject
   Logger LOG;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        LOG.warn("Hello Api is called");
        return "Hello from Quarkus REST";
    }
}
