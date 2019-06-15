package com.java.demo.chapter16.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyRunnable
 * @Date: 2019/5/4 10:11
 */
public class MyRunnable implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(MyRunnable.class);

    @Override
    public void run() {
        logger.info("恭喜你，线程被启动了，执行了run方法中的代码！！！");
    }

}
