package com.java.demo.chapter7.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: StaticMethodDemo
 *
 * @Date: 2018/11/18 21:14
 */
public class StaticMethodDemo {

    private static final Logger logger = LoggerFactory.getLogger(StaticMethodDemo.class);

    private static String s = "This is a static method.";

    public static void print() {
        logger.info(s);
    }

    public static void main(String[] args) {
        StaticMethodDemo.print();
    }

}
