package com.java.demo.chapter16.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyCommon
 * @Date: 2019/5/4 17:31
 */
public class MyCommon implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(MyCommon.class);

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            logger.info("[{}]", i);
        }
        logger.info("前台用户线程执行完毕！！！");
    }

}
