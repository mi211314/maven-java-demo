package com.java.demo.chapter2.sample19;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample19
 *
 * @Date: 2018/9/2 15:57
 */
public class Sample19 {

    private static final Logger logger = LoggerFactory.getLogger(Sample19.class);

    public static void main(String[] args) {
        int i;
        int j;
        double d;
        float f;
        d = 15.145236895f;
        f = 1.354f;
        i = (int) d;
        j = (int) f;
        logger.info("把d强制转换为int型后值为：{}", i);
        logger.info("把f强制转换为int型后值为：{}", j);
    }

}
