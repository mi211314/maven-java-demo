package com.java.demo.chapter11.sample12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @Description: Sample11_12
 *
 * @Date: 2019/3/20 22:59
 */
public class Sample11_12 {

    private static final Logger logger = LoggerFactory.getLogger(Sample11_12.class);

    public static void main(String[] args) {
        String s1 = "874398985432987989.43859479866";
        String s2 = "-380979864656.324535357";
        BigDecimal bd1 = new BigDecimal(s1);
        BigDecimal bd2 = new BigDecimal(s2);
        BigDecimal result = bd1.add(bd2);
        logger.info("bd1 + bd2 = {}", result);
        result = bd1.subtract(bd2);
        logger.info("bd1 - bd2 = {}", result);
        result = bd1.multiply(bd2);
        logger.info("bd1 * bd2 = {}", result);
        result = bd1.divide(bd2, 5, BigDecimal.ROUND_HALF_UP);
        logger.info("bd1 / bd2 = {}", result);
        result = bd2.abs();
        logger.info("abs(bd2) = {}", result);
        result = bd1.movePointLeft(3);
        logger.info("bd1 / 1000 = {}", result);
        result = bd1.movePointRight(5);
        logger.info("bd1 * 100000 = {}", result);
    }

}
