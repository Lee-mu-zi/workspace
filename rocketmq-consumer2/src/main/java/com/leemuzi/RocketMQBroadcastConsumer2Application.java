package com.leemuzi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Consumer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class RocketMQBroadcastConsumer2Application {
    private static final Logger log = LoggerFactory
            .getLogger(RocketMQBroadcastConsumer2Application.class);

    public static void main(String[] args) {
        SpringApplication.run(RocketMQBroadcastConsumer2Application.class, args);
    }

    @Bean
    public Consumer<Message<SimpleMsg>> consumer() {
        return msg -> {
            log.info(Thread.currentThread().getName() + " Consumer2 Receive New Messages: " + msg.getPayload().getMsg());
        };
    }
}
