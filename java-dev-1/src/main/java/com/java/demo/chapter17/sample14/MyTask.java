package com.java.demo.chapter17.sample14;

import java.util.concurrent.atomic.AtomicLongArray;

/**
 * @Description: MyTask
 * @Author: miaolei
 * @Date: 2019/6/5 22:40
 */
public class MyTask implements Runnable {

    private AtomicLongArray ala;

    private String name;

    public MyTask() {

    }

    public MyTask(AtomicLongArray ala, String name) {
        this.ala = ala;
        this.name = name;
    }

    @Override
    public void run() {
        ala.set(9, 12);
        long l = ala.addAndGet(3, 15);
        ala.set(4, 1);
    }

}
