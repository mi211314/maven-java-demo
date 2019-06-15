package com.java.demo.chapter11.sample11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;

/**
 * @Description: Sample11_11
 *
 * @Date: 2019/3/20 22:38
 */
public class Sample11_11 {

    private static final Logger logger = LoggerFactory.getLogger(Sample11_11.class);

    public static void main(String[] args) {
        String s1 = "a75465abc654d534345a6b5d5335af";
        String s2 = "a64873f9d";
        int radix = 16;
        BigInteger bi1 = new BigInteger(s1, radix);
        BigInteger bi2 = new BigInteger(s2, radix);
        BigInteger result = bi1.add(bi2);
        logger.info("bi1 + bi2 = {}", result);
        result = bi1.subtract(bi2);
        logger.info("bi1 - bi2 = {}", result);
        result = bi1.multiply(bi2);
        logger.info("bi1 * bi2 = {}", result);
        result = bi1.divide(bi2);
        logger.info("bi1 / bi2 = {}", result);
        result = bi1.and(bi2);
        logger.info("bi1 & bi2 = {}", result);
        result = bi1.or(bi2);
        logger.info("bi1 | bi2 = {}", result);
        result = bi1.not();
        logger.info("!bi1 = {}", result);
        result = bi1.andNot(bi2);
        logger.info("bi1 &~ bi2 = {}", result);
        result = bi1.gcd(bi2);
        logger.info("bi1 gcd bi2 = {}", result);
        result = bi2.shiftLeft(5);
        logger.info("bi2 << 5 = {}", result);
        result = bi2.shiftRight(10);
        logger.info("bi2 >> 10 = {}", result);
    }

}
