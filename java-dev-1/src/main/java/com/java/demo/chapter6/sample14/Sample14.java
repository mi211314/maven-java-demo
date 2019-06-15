package com.java.demo.chapter6.sample14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample14
 *
 * @Date: 2018/10/29 21:23
 */
public class Sample14 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14.class);

    void showI() {
        int i = 300;
        logger.info("The value of i is {}", i);
    }

    public static void main(String[] args) {
        new Sample14().showI();
    }

}
