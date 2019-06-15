package com.java.demo.chapter18.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample18_2
 * @Author: miaolei
 * @Date: 2019/6/15 10:05
 */
public class Sample18_2 {

    private static final Logger logger = LoggerFactory.getLogger(Sample18_2.class);

    public static void main(String[] args) {
        new Son();
        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        }
    }

}
