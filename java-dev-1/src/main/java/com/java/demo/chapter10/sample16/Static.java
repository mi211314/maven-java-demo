package com.java.demo.chapter10.sample16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Static
 *
 * @Date: 2019/1/27 22:40
 */
public class Static {

    private static final Logger logger = LoggerFactory.getLogger(Static.class);

    public Static() {
        logger.info("静态非final的成员变量初始化！！！");
    }

}
