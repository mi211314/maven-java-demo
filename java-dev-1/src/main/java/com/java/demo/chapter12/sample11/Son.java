package com.java.demo.chapter12.sample11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Son
 *
 * @Date: 2019/3/26 21:48
 */
public class Son extends Father {

    private static final Logger logger = LoggerFactory.getLogger(Son.class);

    @Override
    public void myFunction() throws InterruptedException {
        logger.info("这里是子类方法，该方法抛出InterruptedException异常！！！");
    }

}
