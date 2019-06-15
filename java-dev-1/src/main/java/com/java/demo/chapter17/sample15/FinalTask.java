package com.java.demo.chapter17.sample15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: FinalTask
 * @Author: miaolei
 * @Date: 2019/6/5 22:54
 */
public class FinalTask implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(FinalTask.class);

    @Override
    public void run() {
        logger.info("最后的任务被执行！！！");
    }

}
