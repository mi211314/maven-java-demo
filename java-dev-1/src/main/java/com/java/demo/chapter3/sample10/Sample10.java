package com.java.demo.chapter3.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample10
 *
 * @Date: 2018/9/3 07:31
 */
public class Sample10 {

    private static final Logger logger = LoggerFactory.getLogger(Sample10.class);

    public static void main(String[] args) {
        int a = 12 | 2;
        logger.info("a = {}", a);
    }

}
