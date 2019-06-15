package com.java.demo.chapter4.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11_5
 *
 * @Date: 2018/9/5 22:27
 */
public class Sample5 {

    private static final Logger logger = LoggerFactory.getLogger(Sample5.class);

    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        while (i <= j) {
            logger.info("i = {}", i);
            i++;
        }
    }

}
