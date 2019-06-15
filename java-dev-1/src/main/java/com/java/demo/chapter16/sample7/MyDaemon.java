package com.java.demo.chapter16.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyDaemon
 * @Date: 2019/5/4 17:32
 */
public class MyDaemon implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(MyDaemon.class);

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            logger.info("<{}>", i);
        }
        logger.info("守护线程执行完毕！！！");
    }

}
