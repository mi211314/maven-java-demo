package com.java.demo.chapter17.sample14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLongArray;

/**
 * @Description: Sample17_14
 * @Author: miaolei
 * @Date: 2019/6/5 22:40
 */
public class Sample17_14 {

    public static void main(String[] args) {
        long[] la = new long[]{1, 23, 45, 1, 2, 3, 4, 5, 6, 7, 8, 8, 9,
        2, 4, 5, 6, 7, 8};
        AtomicLongArray ala = new AtomicLongArray(la);
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            threadPool.execute(new MyTask(ala, i + ""));
        }
        threadPool.shutdown();
    }

}
