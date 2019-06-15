package com.java.demo.chapter10.sample16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: UnstaticFinal
 *
 * @Date: 2019/1/27 22:42
 */
public class UnstaticFinal {

    private static final Logger logger = LoggerFactory.getLogger(UnstaticFinal.class);

    public UnstaticFinal() {
        logger.info("非静态final的成员变量初始化！！！");
    }

}
