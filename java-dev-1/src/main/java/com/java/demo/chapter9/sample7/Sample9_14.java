package com.java.demo.chapter9.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample9_14
 *
 * @Date: 2019/1/1 22:38
 */
public class Sample9_14 {

    private static final Logger logger = LoggerFactory.getLogger(Sample9_14.class);

    public static void main(String[] args) {
        String s = null;
        if (s instanceof String) {
            logger.info("恭喜你，测试通过！！！");
        } else {
            logger.info("很遗憾，测试不通过！！！");
        }
    }

}
