package com.leemuzi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NacosConsumerController {
//    @Autowired
//    private RestTemplate restTemplate;

    @Value("${config.info}")
    private String yourConfigValue;

    @GetMapping("/getconfig")
    public String getConfigInfo(){
        return yourConfigValue;
    }

//    @GetMapping(value = "/echo-rest/{str}")
//    public String rest(@PathVariable String str) {
//        return restTemplate.getForObject("http://service-provider/echo/" + str, String.class) + " is result";
//    }
}
