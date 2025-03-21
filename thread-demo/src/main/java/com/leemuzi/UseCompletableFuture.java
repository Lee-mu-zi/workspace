package com.leemuzi;

import java.util.concurrent.CompletableFuture;

public class UseCompletableFuture {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + "5......");
            return "zhuZi";
        });
        // 需要阻塞，否则看不到结果
        Thread.sleep(1000);
    }
}