package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Jio  {
    private Service service;

    @Autowired
    @Qualifier("ht")
    public void setService(Service service) {
        this.service = service;
    }

    public void activateService(){
        service.service();
    }

}
