package com.leemuzi.controller;

import com.leemuzi.feignclient.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/openfeign")
    public String getUser() {
        return userClient.getUser();
    }

}
