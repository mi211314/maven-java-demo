package com.java.demo.chapter16.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyRunnable2
 * @Date: 2019/5/4 17:01
 */
public class MyRunnable2 implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(MyRunnable2.class);

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            logger.info("<{}> 我是线程2！！！", i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                logger.error("线程2异常", e);
            }
        }
    }

}
