package com.leemuzi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //开启动态刷新
public class NacosConfigController {
    @Value("${config.info}")
    private String yourConfigValue;

    @GetMapping("/getconfig")
    public String getConfigInfo(){
        return yourConfigValue;
    }

}
