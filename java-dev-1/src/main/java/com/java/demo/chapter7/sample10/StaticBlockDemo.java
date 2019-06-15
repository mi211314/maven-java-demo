package com.java.demo.chapter7.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: StaticBlockDemo
 *
 * @Date: 2018/11/18 21:19
 */
public class StaticBlockDemo {

    private static final Logger logger = LoggerFactory.getLogger(StaticBlockDemo.class);

    private static int a;

    static {
        StaticBlockDemo.a = 3;
        logger.info("a={}", a);
    }

    static {
        StaticBlockDemo.a = 4;
        logger.info("a={}", a);
    }

    public static void main(String[] args) {

    }

    static {
        StaticBlockDemo.a = 5;
        logger.info("a={}", a);
    }
}
