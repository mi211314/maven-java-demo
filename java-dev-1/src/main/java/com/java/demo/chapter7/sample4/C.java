package com.java.demo.chapter7.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: C
 *
 * @Date: 2018/11/11 22:06
 */
public class C extends B {

    private static final Logger logger = LoggerFactory.getLogger(C.class);

    public C(String s) {
        super.s = s;
    }

    public static void main(String[] args) {
        C c = new C("Protected B");
        logger.info("B.s = {}", c.s);
        c.printB();
    }

}
