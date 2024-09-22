package com.leemuzi.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "openfeign-userservice")
public interface UserClient {

    @GetMapping("/getUser")
    public String getUser();

}
