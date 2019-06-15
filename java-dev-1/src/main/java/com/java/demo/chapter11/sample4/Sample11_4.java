package com.java.demo.chapter11.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11_4
 *
 * @Date: 2019/2/14 21:50
 */
public class Sample11_4 {

    private static final Logger logger = LoggerFactory.getLogger(Sample11_4.class);

    public static void main(String[] args) {
        Integer wInt = new Integer(10);
        int i = wInt.intValue();
        logger.info("i = {}", i);
        byte b = wInt.byteValue();
        logger.info("b = {}", b);
        short s = wInt.shortValue();
        logger.info("s = {}", s);
        double d = wInt.doubleValue();
        logger.info("d = {}", d);
        float f = wInt.floatValue();
        logger.info("f = {}", f);
        long l = wInt.longValue();
        logger.info("l = {}", l);
        Character wChar = new Character('A');
        char c = wChar.charValue();
        logger.info("c = {}", c);
        Boolean wBoolean = new Boolean(true);
        boolean bl = wBoolean.booleanValue();
        logger.info("bl = {}", bl);
    }

}
