package com.leemuzi.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @SentinelResource(value = "sayHello", blockHandler = "getOrderNoBlockHandler")
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    /**
     * 限流后续操作方法
     */
    public static String getOrderNoBlockHandler(String name, BlockException e){
        String msg = "不好意思，前方拥挤，请您稍后再试";
        return msg;
    }
}