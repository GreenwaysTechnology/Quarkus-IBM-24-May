package com.ibm.cdi.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    //api
    public String hello() {
        return "Hello from Quarkus REST!!";
    }
}
