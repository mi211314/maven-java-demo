package com.java.demo.chapter2.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8
 *
 * @Date: 2018/9/1 14:27
 */
public class Sample8 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8.class);

    public static void main(String[] args) {
        boolean a;
        boolean b;
        a = true;
        b = false;
        logger.info("a is {}", a);
        logger.info("b is {}", b);
    }

}
