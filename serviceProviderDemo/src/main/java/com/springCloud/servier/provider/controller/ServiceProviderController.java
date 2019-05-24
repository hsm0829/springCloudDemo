package com.springCloud.servier.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceProviderController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello word!!";
    }
}
