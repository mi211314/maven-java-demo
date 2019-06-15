package com.java.demo.chapter17.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyTaskSingle
 * @Author: miaolei
 * @Date: 2019/5/17 07:42
 */
public class MyTaskSingle implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(MyTaskSingle.class);

    private String name;

    public MyTaskSingle() {

    }

    public MyTaskSingle(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        logger.info("===============任务{}开始执行================", name);
        for (int i = 0; i < 50; i++) {
            logger.info("[{}_{}]", name, i);
        }
        logger.info("===============任务{}执行结束================", name);
    }

}
