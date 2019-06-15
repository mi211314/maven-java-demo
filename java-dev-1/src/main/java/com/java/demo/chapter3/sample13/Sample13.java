package com.java.demo.chapter3.sample13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample13
 *
 * @Date: 2018/9/4 23:26
 */
public class Sample13 {

    private static final Logger logger = LoggerFactory.getLogger(Sample13.class);

    public static void main(String[] args) {
        int a = -8 >>> 1;
        logger.info("a = {}", a);
    }

}
