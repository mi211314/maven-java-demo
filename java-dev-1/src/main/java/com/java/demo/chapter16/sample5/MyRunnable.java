package com.java.demo.chapter16.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyRunnable
 * @Date: 2019/5/4 17:18
 */
public class MyRunnable implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(MyRunnable.class);

    private String flagl;

    private String flagr;

    public MyRunnable(String flagl, String flagr) {
        this.flagl = flagl;
        this.flagr = flagr;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            logger.info("{}", flagl + i + flagr);
            Thread.yield();
        }
    }

}
