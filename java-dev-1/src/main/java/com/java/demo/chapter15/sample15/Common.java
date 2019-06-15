package com.java.demo.chapter15.sample15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Common
 * @Date: 2019/5/3 17:29
 */
public class Common implements OuterClass.InnerInterface {

    private static final Logger logger = LoggerFactory.getLogger(Common.class);

    @Override
    public void show() {
        logger.info("这里是普通类中的方法，该普通类实现了私有内部接口InnerInterface！！！");
    }

}
