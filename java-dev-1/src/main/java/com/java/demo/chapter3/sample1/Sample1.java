package com.java.demo.chapter3.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample1
 *
 * @Date: 2018/9/2 16:54
 */
public class Sample1 {

    private static final Logger logger = LoggerFactory.getLogger(Sample1.class);

    public static void main(String[] args) {
        byte m = 2;
        byte n = 3;
        byte i = (byte) (m + n);
        logger.info("i = {}", i);
    }

}
