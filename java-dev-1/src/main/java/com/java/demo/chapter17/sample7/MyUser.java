package com.java.demo.chapter17.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.locks.Lock;

/**
 * @Description: MyUser
 * @Author: miaolei
 * @Date: 2019/6/3 21:32
 */
public class MyUser implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(MyUser.class);

    private String userName;

    private Lock countLock;

    private MyCount mc;

    private int taskSum;

    public MyUser(String userName, Lock countLock, MyCount mc, int taskSum) {
        this.userName = userName;
        this.countLock = countLock;
        this.mc = mc;
        this.taskSum = taskSum;
    }

    @Override
    public void run() {
        boolean okFlag = false;
        while (!okFlag) {
            try {
                countLock.lock();
                if (taskSum < 0) {
                    if (taskSum + mc.getCount() >= 0) {
                        mc.setCount(mc.getCount() + taskSum);
                        logger.info("{}成功取款{}元，余额为{}元。", userName, (-taskSum), mc.getCount());
                        okFlag = true;
                    }
                } else {
                    mc.setCount(mc.getCount() + taskSum);
                    logger.info("{}成功存款{}元，余额为{}元。", userName, taskSum, mc.getCount());
                    okFlag = true;
                }
             } finally {
                countLock.unlock();
            }
            if (okFlag) {
                break;
            }
            try {
                logger.info("{}余额不足，等待一段时间再试！！！", userName);
                Thread.sleep(100);
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }
    }

}
