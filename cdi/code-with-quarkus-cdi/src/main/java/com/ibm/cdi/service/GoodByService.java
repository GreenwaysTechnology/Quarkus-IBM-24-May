package com.ibm.cdi.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GoodByService {

    public String sayGoodBye(){
        return  "GoodBye";
    }
}
