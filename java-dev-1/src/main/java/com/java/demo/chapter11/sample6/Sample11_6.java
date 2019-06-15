package com.java.demo.chapter11.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample11_6
 *
 * @Date: 2019/3/3 20:00
 */
public class Sample11_6 {

    private static final Logger logger = LoggerFactory.getLogger(Sample11_6.class);

    public static void main(String[] args) {
        double d = 0.0 / 0.0;
        boolean b = Double.isNaN(d);
        logger.info("0.0 / 0.0 {} NaN.", b ?  "is" : "is not");
        Double wDouble = Double.valueOf(d);
        b = wDouble.isNaN();
        logger.info("0.0 / 0.0 {} NaN.", b ?  "is" : "is not");
        logger.info("{}", Double.NaN == Double.NaN);
    }

}
