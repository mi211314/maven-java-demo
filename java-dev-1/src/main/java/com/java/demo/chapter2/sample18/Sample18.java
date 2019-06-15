package com.java.demo.chapter2.sample18;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample18
 *
 * @Date: 2018/9/2 13:45
 */
public class Sample18 {

    private static final Logger logger = LoggerFactory.getLogger(Sample18.class);

    public static void main(String[] args) {
        int a;
        byte b;
        a = 300;
        b = (byte) a;
        logger.info("b = {}", b);
    }

}
