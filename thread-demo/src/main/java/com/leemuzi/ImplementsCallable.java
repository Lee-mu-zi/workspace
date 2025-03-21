package com.leemuzi;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author 李Muzi
 * @Date 2025/2/18 10:00
 * @Description
 */
public class ImplementsCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("熊猫吃竹子");
        return "muzi";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ImplementsCallable callable = new ImplementsCallable();
        FutureTask<String> futureTask  = new FutureTask<>(callable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}
