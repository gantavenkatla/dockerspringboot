package com.docker.spring.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerRestDemo {

    @RequestMapping(value ="/docker",method = RequestMethod.GET)
    public String sayWelcome() {
        return  "Welcome Spring Boot App with Docker";
    }
}
