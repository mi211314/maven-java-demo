package com.java.demo.chapter2.sample13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample13
 *
 * @Date: 2018/9/2 13:24
 */
public class Sample13 {

    private static final Logger logger = LoggerFactory.getLogger(Sample13.class);

    public static void main(String[] args) {
        int a = 100;
        int b;
        {
            int x = 5;
            int y = 6;
            logger.info("x = {}", x);
            logger.info("y = {}", y);
        }
        b = a + 1;
        logger.info("a = {}", a);
        logger.info("b = {}", b);
    }

}
