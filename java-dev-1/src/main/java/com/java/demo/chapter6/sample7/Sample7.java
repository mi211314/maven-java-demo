package com.java.demo.chapter6.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample7
 *
 * @Date: 2018/10/15 23:53
 */
public class Sample7 {

    private static final Logger logger = LoggerFactory.getLogger(Sample7.class);

    public static void main(String[] args) {
        int[] ref = new int[3];
        ref[0] = 12;
        logger.info("ref = {}", ref);
    }

}
