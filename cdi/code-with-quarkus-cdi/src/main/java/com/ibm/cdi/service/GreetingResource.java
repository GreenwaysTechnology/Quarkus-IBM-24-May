package com.ibm.cdi.service;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

//Field Injection
//@Path("/hello")
//public class GreetingResource {
//    //GreetigrngService greetingService = new GreetingService();
//    //Field Injection
//    @Inject
//    private GreetingService greetingService;
//
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello() {
//        return greetingService.hello();
//    }
//}

//Setter Injection
//@Path("/hello")
//public class GreetingResource {
//    private GreetingService greetingService;
//
//    @Inject
//    public void setGreetingService(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello() {
//        return greetingService.hello();
//    }
//}

//constructor injection
//@Path("/hello")
//public class GreetingResource {
//    private GreetingService greetingService;
//
//    @Inject
//    public GreetingResource(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    public GreetingResource() {
//    }
//
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello() {
//        return greetingService.hello();
//    }
//}
//no private keyword
@Path("/hello")
public class GreetingResource {
    @Inject
    GreetingService greetingService;

    @Inject
    GoodByService goodByService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greetingService.hello();
    }

    @GET
    @Path("goodbye")
    public String sayGoodBye() {
        return goodByService.sayGoodBye();
    }
}