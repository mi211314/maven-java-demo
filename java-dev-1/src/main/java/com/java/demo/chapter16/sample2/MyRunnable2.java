package com.java.demo.chapter16.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyRunnable2
 * @Date: 2019/5/4 10:23
 */
public class MyRunnable2 implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(MyRunnable2.class);

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            logger.info("<{}>", i);
        }
    }

}
