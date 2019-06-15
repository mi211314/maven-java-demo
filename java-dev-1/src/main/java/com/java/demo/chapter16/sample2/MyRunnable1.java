package com.java.demo.chapter16.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyRunnable1
 * @Date: 2019/5/4 10:22
 */
public class MyRunnable1 implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(MyRunnable1.class);

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            logger.info("[{}]", i);
        }
    }

}
