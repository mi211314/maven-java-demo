package com.java.demo.chapter7.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: C
 *
 * @Date: 2018/11/11 21:59
 */
public class C {

    private static final Logger logger = LoggerFactory.getLogger(C.class);

    public static void main(String[] args) {
        B b = new B("Public Class B");
        logger.info("B.s = {}", b.s);
        b.printB();
    }

}
