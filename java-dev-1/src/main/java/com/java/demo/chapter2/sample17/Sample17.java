package com.java.demo.chapter2.sample17;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample17
 *
 * @Date: 2018/9/2 13:42
 */
public class Sample17 {

    private static final Logger logger = LoggerFactory.getLogger(Sample17.class);

    public static void main(String[] args) {
        int a;
        byte b;
        a = 100;
        b = (byte) a;
        logger.info("b = {}", b);
    }

}
