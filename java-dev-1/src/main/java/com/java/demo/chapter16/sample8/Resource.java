package com.java.demo.chapter16.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Resource
 * @Date: 2019/5/4 17:42
 */
public class Resource {

    private static final Logger logger = LoggerFactory.getLogger(Resource.class);

    public synchronized void function1(Thread currThread) {
        logger.info("{}线程执行function1方法！！！", currThread.getName());
        try {
            Thread.sleep(1000);
            logger.info("{}线程睡醒了！！！", currThread.getName());
        } catch (InterruptedException e) {
            logger.error("线程异常", e);
        }
    }

    public synchronized void function2(Thread currThread) {
        logger.info("{}线程执行function2方法！！！", currThread.getName());
    }

}
