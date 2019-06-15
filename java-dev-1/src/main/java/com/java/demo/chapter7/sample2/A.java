package com.java.demo.chapter7.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: A
 *
 * @Date: 2018/11/8 23:07
 */
public class A {

    private static final Logger logger = LoggerFactory.getLogger(A.class);

    private B b;

    public A(String s) {
        this.b = new B(s);
    }

    public void printA() {
        logger.info("Public Class A Printing...");
        b.printB();
    }

}
