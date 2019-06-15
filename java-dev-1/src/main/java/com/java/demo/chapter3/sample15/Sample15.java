package com.java.demo.chapter3.sample15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: PackageDemo
 *
 * @Date: 2018/9/4 23:32
 */
public class Sample15 {

    private static final Logger logger = LoggerFactory.getLogger(Sample15.class);

    public static void main(String[] args) {
        int a = 12;
        byte b = 13;
        a >>= 1;
        b += 3;
        logger.info("a = {}", a);
        logger.info("b = {}", b);
    }

}
