package com.java.demo.chapter4.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample7
 *
 * @Date: 2018/9/5 22:41
 */
public class Sample7 {

    private static final Logger logger = LoggerFactory.getLogger(Sample7.class);

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            logger.info("i = {}", i);
        }
    }

}
