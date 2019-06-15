package com.java.demo.chapter8.sample12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_18
 *
 * @Date: 2018/12/9 21:54
 */
public class Sample8_18 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_18.class);

    public static void main(String[] args) {
        Vehicle v = new Car();
        logger.info("调用的结果为：{}", v.getMe());
    }

}
