package com.java.demo.chapter17.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyTask
 * @Author: miaolei
 * @Date: 2019/6/3 21:02
 */
public class MyTask implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(MyTask.class);

    private String name;

    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        logger.info("[任务{}开始执行]", name);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        }
        logger.info("[任务{}执行结束]", name);
    }

}
