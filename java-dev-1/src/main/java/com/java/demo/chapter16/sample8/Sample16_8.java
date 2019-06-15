package com.java.demo.chapter16.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample16_8
 * @Date: 2019/5/4 17:49
 */
public class Sample16_8 {

    private static final Logger logger = LoggerFactory.getLogger(Sample16_8.class);

    public static void main(String[] args) {
        Resource rs = new Resource();
        MyThread t1 = new MyThread("Thread1", rs);
        MyThread t2 = new MyThread("Thread2", rs);
        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            logger.error("主方法异常", e);
        }
        t2.start();
    }

}
