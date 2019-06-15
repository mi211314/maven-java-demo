package com.java.demo.chapter17.sample4;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Description: Sample17_4
 * @Author: miaolei
 * @Date: 2019/5/22 23:01
 */
public class Sample17_4 {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(2);
        ScheduledExecutorService singleScheduledThreadPool = Executors.newSingleThreadScheduledExecutor();
        MyScheduledTask mt1 = new MyScheduledTask("MT1");
        MyScheduledTask mt2 = new MyScheduledTask("MT2");
        scheduledThreadPool.schedule(mt1, 2, TimeUnit.SECONDS);
        singleScheduledThreadPool.schedule(mt2, 2000, TimeUnit.MILLISECONDS);
        scheduledThreadPool.shutdown();
        singleScheduledThreadPool.shutdown();
    }

}
