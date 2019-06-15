package com.java.demo.chapter17.sample2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: Sample17_2
 * @Author: miaolei
 * @Date: 2019/5/17 07:45
 */
public class Sample17_2 {

    public static void main(String[] args) {
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
        MyTaskSingle mt1 = new MyTaskSingle("MT1");
        MyTaskSingle mt2 = new MyTaskSingle("MT2");
        MyTaskSingle mt3 = new MyTaskSingle("MT3");
        singleThreadPool.execute(mt1);
        singleThreadPool.execute(mt2);
        singleThreadPool.execute(mt3);
        singleThreadPool.shutdown();
    }

}
