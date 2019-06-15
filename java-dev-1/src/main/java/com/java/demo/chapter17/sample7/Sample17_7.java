package com.java.demo.chapter17.sample7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: Sample17_7
 * @Author: miaolei
 * @Date: 2019/6/3 21:45
 */
public class Sample17_7 {

    public static void main(String[] args) {
        MyCount mc = new MyCount(50);
        Lock countLock = new ReentrantLock();
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        threadPool.execute(new MyUser("User1", countLock, mc, -200));
        threadPool.execute(new MyUser("User2", countLock, mc, 200));
        threadPool.shutdown();
    }

}
