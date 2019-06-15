package com.java.demo.chapter11.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11_2
 *
 * @Date: 2019/2/14 21:27
 */
public class Sample11_2 {

    private static final Logger logger = LoggerFactory.getLogger(Sample11_2.class);

    public static void main(String[] args) {
        String number = "60";
        byte b = Byte.parseByte(number);
        logger.info("十进制byte = {}", b);
        b = Byte.parseByte(number, 8);
        logger.info("八进制byte = {}", b);
        number = "-30";
        short s = Short.parseShort(number);
        logger.info("十进制short = {}", s);
        s = Short.parseShort(number, 8);
        logger.info("八进制short = {}", s);
        number = "100101";
        int i = Integer.parseInt(number);
        logger.info("十进制int = {}", i);
        i = Integer.parseInt(number, 2);
        logger.info("二进制int = {}", i);
        number = "124.34F";
        float f = Float.parseFloat(number);
        logger.info("float = {}", f);
        number = "111.2431";
        double d = Double.parseDouble(number);
        logger.info("double = {}", d);
        number = "75725143246542303";
        long l = Long.parseLong(number);
        logger.info("十进制long = {}", l);
        l = Long.parseLong(number, 8);
        logger.info("八进制long = {}", l);
    }

}
