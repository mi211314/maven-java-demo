package com.java.demo.chapter7.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: ClassInfo
 *
 * @Date: 2018/11/11 22:55
 */
public class ClassInfo {

    private static final Logger logger = LoggerFactory.getLogger(ClassInfo.class);

    private static int number;

    public ClassInfo() {
        number++;
    }

    public void showNumber() {
        logger.info("number={}", number);
    }

}
