package com.java.demo.chapter8.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_13_Son
 *
 * @Date: 2018/11/26 21:20
 */
public class Sample8_13_Son extends Sample8_13 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_13_Son.class);

    public void getShow() {
        logger.info("子类内代码调用结果");
        this.show();
    }

}
