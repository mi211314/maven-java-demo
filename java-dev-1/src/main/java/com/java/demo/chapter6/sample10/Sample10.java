package com.java.demo.chapter6.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample10
 *
 * @Date: 2018/10/29 21:09
 */
public class Sample10 {

    private static final Logger logger = LoggerFactory.getLogger(Sample10.class);

    public static void main(String[] args) {
        int i;
        int j;
        i = 2500;
        j = 3000;
        logger.info("i={}, j={}", i, j);
    }

}
