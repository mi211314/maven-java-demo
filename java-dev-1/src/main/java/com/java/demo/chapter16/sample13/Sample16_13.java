package com.java.demo.chapter16.sample13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample16_13
 * @Author: miaolei
 * @Date: 2019/5/13 23:20
 */
public class Sample16_13 {

    private static final Logger logger = LoggerFactory.getLogger(Sample16_13.class);

    public static void main(String[] args) {
        Thread current = Thread.currentThread();
        long id = current.getId();
        String name = current.getName();
        int priority = current.getPriority();
        logger.info("=====================================");
        logger.info("线程id={},线程名称={}，线程优先级={}",
                id, name, priority);
        logger.info("=====================================");
    }

}
