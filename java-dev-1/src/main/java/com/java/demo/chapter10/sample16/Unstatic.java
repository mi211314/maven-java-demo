package com.java.demo.chapter10.sample16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Unstatic
 *
 * @Date: 2019/1/27 22:43
 */
public class Unstatic {

    private static final Logger logger = LoggerFactory.getLogger(Unstatic.class);

    public Unstatic() {
        logger.info("非静态非final的成员变量初始化！！！");
    }

}
