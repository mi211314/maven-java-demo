package com.java.demo.chapter16.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyThread
 * @Author: miaolei
 * @Date: 2019/5/13 22:57
 */
public class MyThread extends Thread {

    private static final Logger logger = LoggerFactory.getLogger(MyThread.class);

    private Object resource;

    public MyThread() {

    }

    public MyThread(Object resource, String name) {
        this.resource = resource;
        this.setName(name);
    }

    @Override
    public void run() {
        synchronized (resource) {
            logger.info("{}线程访问了资源", this.getName());
            logger.info("{}线程带着锁睡觉去了！！！", this.getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                logger.error(e.getMessage(), e);
            }
            logger.info("{}线程带着锁睡醒后释放了锁！！！", this.getName());
        }
    }

}
