package com.java.demo.chapter11.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11_10
 *
 * @Date: 2019/3/8 22:40
 */
public class Sample11_10 {

    private static final Logger logger = LoggerFactory.getLogger(Sample11_10.class);

    private Byte wByte;

    private Short wShort;

    private Boolean wBoolean;

    private Character wChar;

    private Integer wInt;

    private  Double wDouble;

    private Float wFloat;

    private Long wLong;

    public Sample11_10() {
        byte b = 10;
        wByte = b;
        short s = 12;
        wShort = s;
        boolean b1 = true;
        wBoolean = b1;
        char c = 'A';
        wChar = c;
        int i = 12;
        wInt = i;
        double d = 12.321;
        wDouble = d;
        float f = 23.28f;
        wFloat = f;
        long l = 217864873872324324L;
        wLong = l;
    }

    public static void main(String[] args) {
        Sample11_10 demo = new Sample11_10();
        logger.info("Byte: {}", demo.wByte);
        logger.info("Short: {}", demo.wShort);
        logger.info("Boolean: {}", demo.wBoolean);
        logger.info("Character: {}", demo.wChar);
        logger.info("Integer: {}", demo.wInt);
        logger.info("Double: {}", demo.wDouble);
        logger.info("Float: {}", demo.wFloat);
        logger.info("Long: {}", demo.wLong);
    }

}
