package com.java.demo.chapter8.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_6
 *
 * @Date: 2018/11/25 21:26
 */
public class Sample8_6 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_6.class);

    public static void main(String[] args) {
        Sample8_5_Son s = new Sample8_5_Son();
        logger.info("子类外代码调用结果：{}", s.str);
        s.getShow();
    }

}
