package com.java.demo.chapter8.sample18;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_24
 *
 * @Date: 2018/12/10 07:32
 */
public class Sample8_24 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_24.class);

    public static void main(String[] args) {
        Adder a = new Adder();
        logger.info("2 + 5 = {}", a.add(2, 5));
        logger.info("5 + 30.8 = {}", a.add(5, 30.8));
    }

}
