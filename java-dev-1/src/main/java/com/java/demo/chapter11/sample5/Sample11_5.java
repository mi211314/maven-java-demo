package com.java.demo.chapter11.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11_5
 *
 * @Date: 2019/2/14 22:01
 */
public class Sample11_5 {

    private static final Logger logger = LoggerFactory.getLogger(Sample11_5.class);

    public static void main(String[] args) {
        Integer wInt;
        int i = 10;
        int radix = 2;
        String s = "1001011";
        wInt = Integer.valueOf(i);
        logger.info("int = {}, Integer = {}", i, wInt);
        wInt = Integer.valueOf(s);
        logger.info("String = {}, Integer = {}", s, wInt);
        wInt = Integer.valueOf(s, radix);
        logger.info("String = {}, Integer = {}", s, wInt);
        Boolean wBoolean;
        boolean b = true;
        s = "false";
        wBoolean = Boolean.valueOf(b);
        logger.info("boolean = {}, Boolean = {}", b, wBoolean);
        wBoolean = Boolean.valueOf(s);
        logger.info("String = {}, Boolean = {}", s, wBoolean);
    }

}
