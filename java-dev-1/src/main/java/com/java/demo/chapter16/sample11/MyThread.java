package com.java.demo.chapter16.sample11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyThread
 * @Author: miaolei
 * @Date: 2019/5/13 23:05
 */
public class MyThread extends Thread {

    private static final Logger logger = LoggerFactory.getLogger(MyThread.class);

    private Object resource1;

    private Object resource2;

    public MyThread() {

    }

    public MyThread(Object resource1, Object resource2, String name) {
        this.resource1 = resource1;
        this.resource2 = resource2;
        this.setName(name);
    }

    @Override
    public void run() {
        synchronized (resource1) {
            logger.info("{}线程拿到{}对象的锁！！！", this.getName(), resource1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                logger.error(e.getMessage(), e);
            }
            logger.info("{}等待{}对象的锁释放！！！", this.getName(), resource2);
            synchronized (resource2) {
                logger.info("{}线程拿到了{}的锁！！！", this.getName(), resource2);
                logger.info("{}可以对两个资源同时操作了！！！", this.getName());
            }
        }
    }

}
