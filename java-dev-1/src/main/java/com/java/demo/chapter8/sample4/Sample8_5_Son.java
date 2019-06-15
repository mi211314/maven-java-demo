package com.java.demo.chapter8.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_5_Son
 *
 * @Date: 2018/11/25 21:15
 */
public class Sample8_5_Son extends Sample8_5 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_5_Son.class);

    public void getShow() {
        logger.info("子类内代码调用结果：{}", this.str);
    }

}
