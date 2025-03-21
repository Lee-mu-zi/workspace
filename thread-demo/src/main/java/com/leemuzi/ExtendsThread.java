package com.leemuzi;

/**
 * Hello world!
 *
 */
public class ExtendsThread extends Thread
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }

    public static void main(String[] args )
    {
        new ExtendsThread().start();
    }
}

