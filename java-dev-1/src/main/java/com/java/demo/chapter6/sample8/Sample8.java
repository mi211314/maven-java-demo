package com.java.demo.chapter6.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8
 *
 * @Date: 2018/10/16 00:01
 */
public class Sample8 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8.class);

    private static final int NUM = 13;

    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        if (b > NUM) {
            a = 13;
            logger.info("a = {}", a);
        }
        logger.info("a = {}", a);
        logger.info("b = {}", b);
    }

}
