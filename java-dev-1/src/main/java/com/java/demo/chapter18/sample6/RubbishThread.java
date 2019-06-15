package com.java.demo.chapter18.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: RubbishThread
 * @Author: miaolei
 * @Date: 2019/6/15 10:36
 */
public class RubbishThread extends Thread {

    private static final Logger logger = LoggerFactory.getLogger(RubbishThread.class);

    RubbishThread brother;

    private String name;

    public RubbishThread() {

    }

    public RubbishThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        logger.info("{}开始执行！！！", this.name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        }
        logger.info("{}执行结束！！！", this.name);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        logger.info("{}对象成为垃圾，并被收集！！！", this.name);
    }

}
