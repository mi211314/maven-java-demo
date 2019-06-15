package com.java.demo.chapter3.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample7
 *
 * @Date: 2018/9/2 22:02
 */
public class Sample7 {

    private static final Logger logger = LoggerFactory.getLogger(Sample7.class);

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        boolean m = (++a > 5) && (++b > 5);
        logger.info("a={},b={},m={}", a, b, m);
    }

}
