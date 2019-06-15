package com.java.demo.chapter7.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: B
 *
 * @Date: 2018/11/8 23:17
 */
public class B {

    private static final Logger logger = LoggerFactory.getLogger(B.class);

    public String s;

    public B(String s) {
        this.s = s;
    }

    public void printB() {
        logger.info("Class B Printing...");
        logger.info(s);
    }

}
