package com.java.demo.chapter10.sample16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: StaticFinal
 *
 * @Date: 2019/1/27 22:38
 */
public class StaticFinal {

    private static final Logger logger = LoggerFactory.getLogger(StaticFinal.class);

    public StaticFinal() {
        logger.info("静态final的成员变量初始化！！！");
    }
}
