package com.ibm.cdi.service.interfaces;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("books")
public class BookResource {

    @Inject
    NumberGenerator numberGenerator;
    @GET
    public String getISBN(){
        return numberGenerator.generateISBNGenerator();
    }
}
