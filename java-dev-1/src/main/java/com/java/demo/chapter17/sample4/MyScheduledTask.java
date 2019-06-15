package com.java.demo.chapter17.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyScheduledTask
 * @Author: miaolei
 * @Date: 2019/5/22 23:03
 */
public class MyScheduledTask implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(MyScheduledTask.class);

    private String name;

    public MyScheduledTask() {

    }

    public MyScheduledTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        logger.info("{}任务时延2秒执行！！！", name);
    }

}
