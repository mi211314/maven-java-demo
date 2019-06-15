package com.java.demo.chapter16.sample12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample16_12
 * @Author: miaolei
 * @Date: 2019/5/13 23:18
 */
public class Sample16_12 {

    private static final Logger logger = LoggerFactory.getLogger(Sample16_12.class);

    public static void main(String[] args) {
        Object resource1 = new Object();
        Object resource2 = new Object();
        synchronized (resource1) {
            try {
                resource2.wait();
            } catch (InterruptedException e) {
                logger.error(e.getMessage(), e);
            }
        }
    }

}
