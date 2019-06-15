package com.java.demo.chapter16.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyThread1
 * @Date: 2019/5/4 17:10
 */
public class MyThread1 extends Thread {

    private static final Logger logger = LoggerFactory.getLogger(MyThread1.class);

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            logger.info("<Min{}> ", i);
        }
    }

}
