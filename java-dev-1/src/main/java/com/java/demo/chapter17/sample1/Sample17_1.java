package com.java.demo.chapter17.sample1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: Sample17_1
 * @Author: miaolei
 * @Date: 2019/5/17 07:36
 */
public class Sample17_1 {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        MyTask mt1 = new MyTask("MT1");
        MyTask mt2 = new MyTask("MT2");
        MyTask mt3 = new MyTask("MT3");
        threadPool.execute(mt1);
        threadPool.execute(mt2);
        threadPool.execute(mt3);
        threadPool.shutdown();
    }

}
