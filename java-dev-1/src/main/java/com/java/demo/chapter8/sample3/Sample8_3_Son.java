package com.java.demo.chapter8.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_3_Son
 *
 * @Date: 2018/11/25 21:06
 */
public class Sample8_3_Son extends Sample8_3 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_3_Son.class);

    public void getShow() {
        logger.info("子类内代码调用结果：{}", this.str);
    }

}
