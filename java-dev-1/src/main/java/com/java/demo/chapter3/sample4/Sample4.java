package com.java.demo.chapter3.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample4
 *
 * @Date: 2018/9/2 21:41
 */
public class Sample4 {

    private static final Logger logger = LoggerFactory.getLogger(Sample4.class);

    public static void main(String[] args) {
        logger.info("15 % -4 = {}", 15 % -4);
        logger.info("-15 % 4 = {}", -15 % 4);
        logger.info("6.8% 6.3 = {}", 6.8 % 6.3);
        logger.info("15.0 % 0 = {}", 15.0 % 0);
        logger.info("15 % 0 = {}", 15 % 0);
    }

}
