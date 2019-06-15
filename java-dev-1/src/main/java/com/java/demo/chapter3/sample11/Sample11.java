package com.java.demo.chapter3.sample11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11
 *
 * @Date: 2018/9/3 07:34
 */
public class Sample11 {

    private static final Logger logger = LoggerFactory.getLogger(Sample11.class);

    public static void main(String[] args) {
        int a = 8 << 1;
        logger.info("a = {}", a);
    }

}
