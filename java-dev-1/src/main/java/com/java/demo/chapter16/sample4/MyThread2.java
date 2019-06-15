package com.java.demo.chapter16.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyThread2
 * @Date: 2019/5/4 17:12
 */
public class MyThread2 extends Thread {

    private static final Logger logger = LoggerFactory.getLogger(MyThread2.class);

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            logger.info("[Max{}] ", i);
        }
    }

}
