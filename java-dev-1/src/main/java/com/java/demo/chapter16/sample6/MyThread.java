package com.java.demo.chapter16.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyThread
 * @Date: 2019/5/4 17:24
 */
public class MyThread extends Thread {

    private static final Logger logger = LoggerFactory.getLogger(MyThread.class);

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            logger.info("[{}]", i);
        }
        logger.info("{子线程执行结束}");
    }

}
