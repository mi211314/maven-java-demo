package com.java.demo.chapter17.sample15;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: Sample17_15
 * @Author: miaolei
 * @Date: 2019/6/5 22:55
 */
public class Sample17_15 {

    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(5, new FinalTask());
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            threadPool.execute(new PartTask(cb, "PartTask" + i, 1000));
        }
        threadPool.shutdown();
    }

}
