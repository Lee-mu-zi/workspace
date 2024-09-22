package com.leemuzi.controller;

import com.leemuzi.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService service;

    @GetMapping(value = "/hello/{name}")
    public String sentinelA(@PathVariable String name) {
        return service.sayHello(name);
    }

    @GetMapping(value = "/hello/sentinelB")
    public String sentinelB() {
        return "我是关联接口";
    }

}