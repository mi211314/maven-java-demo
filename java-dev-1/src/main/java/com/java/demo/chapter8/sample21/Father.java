package com.java.demo.chapter8.sample21;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Father
 *
 * @Date: 2018/12/16 20:45
 */
public class Father {

    private static final Logger logger = LoggerFactory.getLogger(Father.class);

    public final void show() {
        logger.info("我是final方法，可以被继承，但是不能被重写！！！");
    }

}
