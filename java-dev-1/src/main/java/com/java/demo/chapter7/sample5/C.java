package com.java.demo.chapter7.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: C
 *
 * @Date: 2018/11/11 22:22
 */
public class C {

    private static final Logger logger = LoggerFactory.getLogger(C.class);

    public C() {

    }

    public static void main(String[] args) {
        B b = new B("Default B");
        logger.info("B.s = {}", b.s);
        b.printB();
    }

}
