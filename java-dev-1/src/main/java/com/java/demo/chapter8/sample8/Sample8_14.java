package com.java.demo.chapter8.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_24
 *
 * @Date: 2018/11/26 21:23
 */
public class Sample8_14 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_14.class);

    public static void main(String[] args) {
        Sample8_13_Son s  = new Sample8_13_Son();
        logger.info("子类外代码调用结果：");
        s.show();
        s.getShow();
    }

}
