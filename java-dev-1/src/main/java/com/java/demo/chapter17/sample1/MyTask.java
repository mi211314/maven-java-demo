package com.java.demo.chapter17.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyTask
 * @Author: miaolei
 * @Date: 2019/5/17 07:33
 */
public class MyTask implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(MyTask.class);

    private String name;

    public MyTask() {

    }

    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        logger.info("===============任务{}开始执行================", name);
        for (int i = 0; i < 50; i++) {
            logger.info("[{}_{}]", name, i);
        }
        logger.info("===============任务{}执行结束=================", name);
    }

}
