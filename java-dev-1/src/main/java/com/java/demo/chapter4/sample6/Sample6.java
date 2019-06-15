package com.java.demo.chapter4.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample6
 *
 * @Date: 2018/9/5 22:34
 */
public class Sample6 {

    private static final Logger logger = LoggerFactory.getLogger(Sample6.class);

    public static void main(String[] args) {
        int i = 0;
        do {
            logger.info("i = {}", i);
            i++;
        } while (i <= 10);
    }

}
