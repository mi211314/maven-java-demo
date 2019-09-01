package com.sync.demo.sample2;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description: SyncTest
 * @Author: miaolei
 * @Date: 2019/8/19 23:29
 */
@Slf4j
public class SyncTest {

    private synchronized void method1() {
        log.info("method 1 start");
        log.info("method 1 execute");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            log.error(e.getMessage(), e);
        }
        log.info("method 1 end");
    }

    private synchronized void method2() {
        log.info("method 2 start");
        log.info("method 2 execute");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            log.error(e.getMessage(), e);
        }
        log.info("method 2 end");
    }

    public static void main(String[] args) {
        SyncTest test = new SyncTest();
        new Thread(() -> test.method1()).start();
        new Thread(() -> test.method2()).start();

    }

}
