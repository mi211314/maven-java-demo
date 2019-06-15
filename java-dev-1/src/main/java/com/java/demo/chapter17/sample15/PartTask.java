package com.java.demo.chapter17.sample15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CyclicBarrier;

/**
 * @Description: PartTask
 * @Author: miaolei
 * @Date: 2019/6/5 22:51
 */
public class PartTask implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(PartTask.class);

    private CyclicBarrier cb;

    private String name;

    private int duringTime;

    public PartTask() {

    }

    public PartTask(CyclicBarrier cb, String name, int duringTime) {
        this.cb = cb;
        this.name = name;
        this.duringTime = duringTime;
    }

    @Override
    public void run() {
        logger.info("{}子任务开始执行！！！", name);
        try {
            Thread.sleep(duringTime);
            logger.info("{}子任务执行结束！！！", name);
            cb.await();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

}
