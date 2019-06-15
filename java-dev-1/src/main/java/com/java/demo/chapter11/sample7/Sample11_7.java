package com.java.demo.chapter11.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11_7
 *
 * @Date: 2019/3/3 22:32
 */
public class Sample11_7 {

    private static final Logger logger = LoggerFactory.getLogger(Sample11_7.class);

    public static void main(String[] args) {
        int i = 125;
        Integer wInt = Integer.valueOf(i);
        logger.info("wInt {} wInt", wInt.equals(wInt) ? "等于" : "不等于");
        logger.info("wInt {} wInt", wInt == wInt ? "==" : "!=");
        Integer wInt1 = Integer.valueOf(i);
        logger.info("wInt {} wInt1", wInt.equals(wInt1) ? "等于" : "不等于");
        logger.info("wInt {} wInt1", wInt == wInt1 ? "==" : "!=");
        int i1 = 127;
        wInt1 = Integer.valueOf(i1);
        logger.info("wInt {} wInt1", wInt.equals(wInt1) ? "等于" : "不等于");
        logger.info("wInt {} wInt1", wInt == wInt1 ? "==" : "!=");
    }

}
