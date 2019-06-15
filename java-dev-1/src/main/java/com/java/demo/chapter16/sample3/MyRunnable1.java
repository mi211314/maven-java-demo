package com.java.demo.chapter16.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyRunnable1
 * @Date: 2019/5/4 16:58
 */
public class MyRunnable1 implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(MyRunnable1.class);

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            logger.info("[{}] 我是线程1！！！", i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                logger.error("线程1异常", e);
            }
        }
    }

}
