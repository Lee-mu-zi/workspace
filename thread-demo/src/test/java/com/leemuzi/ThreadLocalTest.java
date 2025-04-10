package com.leemuzi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author 李Muzi
 * @Date 2025/2/21 21:55
 * @Description
 */
public class ThreadLocalTest {
    static ThreadLocal<String> localVar = new ThreadLocal<>();

    static void print(String str) {
        //打印当前线程中本地内存中本地变量的值
        System.out.println(str + " :" + localVar.get());
        //清除本地内存中的本地变量
        localVar.remove();
    }


    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //设置线程1中本地变量的值
                localVar.set("localVar1");
                //调用打印方法
//                print("thread1");
                //打印本地变量
                System.out.println("localVar1 : " + localVar.get());
            }
        });

//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                //设置线程1中本地变量的值
//                localVar.set("localVar2");
//                //调用打印方法
////                print("thread2");
//                //打印本地变量
//                System.out.println("after remove : " + localVar.get());
//            }
//        });

        thread1.start();
//        thread2.start();
    }

}
