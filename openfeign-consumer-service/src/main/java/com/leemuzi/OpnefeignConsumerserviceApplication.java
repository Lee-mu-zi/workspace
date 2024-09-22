package com.leemuzi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class OpnefeignConsumerserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpnefeignConsumerserviceApplication.class, args);
    }

}