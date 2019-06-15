package com.java.demo.chapter7.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: B
 *
 * @Date: 2018/11/11 22:04
 */
public class B {

    private static final Logger logger = LoggerFactory.getLogger(B.class);

    protected String s;

    public B() {

    }

    public B(String s) {
        this.s = s;
    }

    protected void printB() {
        logger.info("Protected printB Printing...");
        logger.info(s);
    }

}
