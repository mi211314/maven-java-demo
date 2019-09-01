package com.sync.demo.sample1;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description: SyncTest
 * @Author: miaolei
 * @Date: 2019/8/19 23:21
 */
@Slf4j
public class SyncTest implements Runnable {

    private static int i = 0;

    private synchronized void increase() {
        i++;
    }

    @Override
    public void run() {
        for (int j = 0; j < 10000; j ++) {
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SyncTest test = new SyncTest();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        log.info("i = {}", i);
    }

}
