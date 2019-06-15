package com.java.demo.chapter16.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample16_3
 * @Date: 2019/5/4 17:03
 */
public class Sample16_3 {

    private static final Logger logger = LoggerFactory.getLogger(Sample16_3.class);

    public static void main(String[] args) {
        MyRunnable1 mr1 = new MyRunnable1();
        MyRunnable2 mr2 = new MyRunnable2();
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);
        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            logger.error("主线程异常", e);
        }
        t2.start();
    }

}
