package com.java.demo.chapter6.sample11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11
 *
 * @Date: 2018/10/29 21:12
 */
public class Sample11 {

    private static final Logger logger = LoggerFactory.getLogger(Sample11.class);

    public static void main(String[] args) {
        int i;
        final int x = 90;
        final int y = 50;
        if (x > y) {
            i = 10;
        }
        int j = i;
        logger.info("i={}, j={}", i, j);
    }

}
