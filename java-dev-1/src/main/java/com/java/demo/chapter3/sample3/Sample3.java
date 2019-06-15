package com.java.demo.chapter3.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample3
 *
 * @Date: 2018/9/2 21:34
 */
public class Sample3 {

    private static final Logger logger = LoggerFactory.getLogger(Sample3.class);

    public static void main(String[] args) {
        int a = -2147483648;
        int b = -a;
        logger.info("b = {}", b);
    }

}
