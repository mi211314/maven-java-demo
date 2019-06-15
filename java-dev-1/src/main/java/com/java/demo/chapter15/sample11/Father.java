package com.java.demo.chapter15.sample11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Father
 * @Date: 2019/5/3 16:11
 */
public class Father {

    private static final Logger logger = LoggerFactory.getLogger(Father.class);

    public void show() {
        logger.info("这里是Father类的方法！！！");
    }

}
