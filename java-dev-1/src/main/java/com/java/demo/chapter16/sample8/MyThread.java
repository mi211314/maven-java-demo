package com.java.demo.chapter16.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyThread
 * @Date: 2019/5/4 17:46
 */
public class MyThread extends Thread {

    private static final Logger logger = LoggerFactory.getLogger(MyThread.class);

    private Resource rs;

    public MyThread(String name, Resource rs) {
        this.setName(name);
        this.rs = rs;
    }

    @Override
    public void run() {
        if (this.getName().equals("Thread1")) {
            rs.function1(this);
        } else {
            logger.info("Thread2启动，等待进入同步方法function2！！！");
            rs.function2(this);
        }
    }

}
