package com.ibm.cdi.service.interfaces;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Random;

@ApplicationScoped
public class ISBNGenerator implements NumberGenerator{
    @Override
    public String generateISBNGenerator() {
        return "15-232323232" + Math.abs(new Random().nextInt());
    }
}
