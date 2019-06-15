package com.java.demo.chapter10.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample10_7
 *
 * @Date: 2019/1/13 22:53
 */
public class Sample10_7 {

    private static final Logger logger = LoggerFactory.getLogger(Sample10_7.class);

    public static void main(String[] args) {
        new Bird();
        logger.info("==========================================");
        new Bird(2);
    }

}
