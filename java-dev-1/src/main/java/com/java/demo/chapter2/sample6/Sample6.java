package com.java.demo.chapter2.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample6
 *
 * @Date: 2018/9/1 14:21
 */
public class Sample6 {

    private static final Logger logger = LoggerFactory.getLogger(Sample6.class);

    public static void main(String[] args) {
        char c1;
        char c2;
        c1 = 66;
        c2 = 'z';
        logger.info("c1={},c2={}", c1, c2);
    }

}
