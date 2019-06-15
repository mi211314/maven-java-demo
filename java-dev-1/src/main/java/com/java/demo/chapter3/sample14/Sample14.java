package com.java.demo.chapter3.sample14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample14
 *
 * @Date: 2018/9/4 23:28
 */
public class Sample14 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14.class);

    public static void main(String[] args) {
        int i = 88 >> 32;
        long l = 67 << 64;
        logger.info("i = {}", i);
        logger.info("l = {}", l);
    }

}
