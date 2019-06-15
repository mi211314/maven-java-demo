package com.java.demo.chapter3.sample12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample12
 *
 * @Date: 2018/9/4 23:24
 */
public class Sample12 {

    private static final Logger logger = LoggerFactory.getLogger(Sample12.class);

    public static void main(String[] args) {
        int a = -8 >> 1;
        logger.info("a = {}", a);
    }

}
