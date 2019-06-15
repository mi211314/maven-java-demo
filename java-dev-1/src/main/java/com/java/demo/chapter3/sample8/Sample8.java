package com.java.demo.chapter3.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8
 *
 * @Date: 2018/9/3 07:14
 */
public class Sample8 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8.class);

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        boolean m = (++a < 5) || (++b < 5);
        logger.info("a = {}, b = {}, m = {}", a, b, m);
    }

}
