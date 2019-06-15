package com.java.demo.chapter11.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11_1
 *
 * @Date: 2019/2/14 21:12
 */
public class Sample11_1 {

    private static final Logger logger = LoggerFactory.getLogger(Sample11_1.class);

    private Byte wByte;

    private Short wShort;

    private Boolean wBoolean;

    private Character wChar;

    private  Integer wInt;

    private Double wDouble;

    private Float wFloat;

    private Long wLong;

    public Sample11_1() {
        byte b = 10;
        wByte = new Byte(b);
        short s = 12;
        wShort = new Short(s);
        boolean b1 = true;
        wBoolean = new Boolean(b1);
        char c = 'A';
        wChar = new Character(c);
        int i = 12;
        wInt = new Integer(i);
        double d = 12.321;
        wDouble = new Double(d);
        float f = 23.28F;
        wFloat = new Float(f);
        long l = 217864873872324324L;
        wLong = new Long(l);
    }

    public static void main(String[] args) {
        Sample11_1 demo = new Sample11_1();
        logger.info("Byte = {}", demo.wByte);
        logger.info("Short = {}", demo.wShort);
        logger.info("Boolean = {}", demo.wBoolean);
        logger.info("Character = {}", demo.wChar);
        logger.info("Integer = {}", demo.wInt);
        logger.info("Double = {}", demo.wDouble);
        logger.info("Float = {}", demo.wFloat);
        logger.info("Long = {}", demo.wLong);
    }

}
