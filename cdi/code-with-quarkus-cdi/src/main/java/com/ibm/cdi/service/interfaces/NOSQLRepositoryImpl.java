package com.ibm.cdi.service.interfaces;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("nosql")
public class NOSQLRepositoryImpl implements Repository{
    @Override
    public String findAll() {
        return "NoSql FindAll";
    }
}
