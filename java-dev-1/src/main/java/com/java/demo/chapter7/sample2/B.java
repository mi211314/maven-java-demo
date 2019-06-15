package com.java.demo.chapter7.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: B
 *
 * @Date: 2018/11/8 23:02
 */
class B {

    private static final Logger logger = LoggerFactory.getLogger(B.class);

    private String s;

    public B(String s) {
        this.s = s;
    }

    public void printB() {
        logger.info("Default Class B Printing...");
        logger.info(s);
    }

}
