package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Jio  {
    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public void activateService(){
        service.service();
    }

}
