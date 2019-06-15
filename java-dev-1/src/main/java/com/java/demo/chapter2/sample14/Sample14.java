package com.java.demo.chapter2.sample14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample14
 *
 * @Date: 2018/9/2 13:30
 */
public class Sample14 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14.class);

    public static void main(String[] args) {
        short a = 200;
        short b = 10;
        int c = a * b;
        logger.info("c = {}", c);
    }

}
