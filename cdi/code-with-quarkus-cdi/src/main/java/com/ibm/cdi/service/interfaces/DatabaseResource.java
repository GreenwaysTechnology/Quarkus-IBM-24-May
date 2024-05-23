package com.ibm.cdi.service.interfaces;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("database")
public class DatabaseResource {

    @Inject
    @Named("nosql")
    Repository repository;

    @GET
    public String getDatabaseType() {
        return repository.findAll();
    }
}
