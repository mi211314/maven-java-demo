package com.java.demo.chapter7.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: B
 *
 * @Date: 2018/11/11 22:33
 */
public class B {

    private static final Logger logger = LoggerFactory.getLogger(B.class);

    private String s;

    public B() {

    }

    public B(String s) {
        this.s = s;
    }

    private void printB() {
        logger.info("Private printB Printing...");
        logger.info(s);
    }

    public static void main(String[] args) {
        B b = new B("Private B");
        logger.info("B.s = {}", b.s);
        b.printB();
    }

}
