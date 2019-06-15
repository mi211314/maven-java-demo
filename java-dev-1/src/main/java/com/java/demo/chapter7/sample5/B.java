package com.java.demo.chapter7.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: B
 *
 * @Date: 2018/11/11 22:20
 */
public class B {

    private static final Logger logger = LoggerFactory.getLogger(B.class);

    String s;

    public B() {
    }

    public B(String s) {
        this.s = s;
    }

    void printB() {
        logger.info("Default printB Printing...");
        logger.info(s);
    }

}
