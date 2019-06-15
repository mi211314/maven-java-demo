package com.java.demo.chapter18.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample18_4
 * @Author: miaolei
 * @Date: 2019/6/15 10:21
 */
public class Sample18_4 {

    private static final Logger logger = LoggerFactory.getLogger(Sample18_4.class);

    public static void main(String[] args) {
        new FinalGuarderSon();
        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        }
    }

}
