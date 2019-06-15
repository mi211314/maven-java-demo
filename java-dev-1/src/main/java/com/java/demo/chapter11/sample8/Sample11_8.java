package com.java.demo.chapter11.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11_8
 *
 * @Date: 2019/3/8 22:27
 */
public class Sample11_8 {

    private static final Logger logger = LoggerFactory.getLogger(Sample11_8.class);

    public static void main(String[] args) {
        Integer wInt = Integer.valueOf("2345");
        logger.info("wInt: {}", wInt.toString());
        Boolean wBoolean = Boolean.valueOf(true);
        logger.info("wBoolean: {}", wBoolean.toString());
    }

}
