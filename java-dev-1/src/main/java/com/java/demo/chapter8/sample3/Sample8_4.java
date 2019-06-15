package com.java.demo.chapter8.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_4
 *
 * @Date: 2018/11/25 21:09
 */
public class Sample8_4 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_4.class);

    public static void main(String[] args) {
        Sample8_3_Son s = new Sample8_3_Son();
        logger.info("子类外代码调用结果：{}", s.str);
        s.getShow();
    }

}
