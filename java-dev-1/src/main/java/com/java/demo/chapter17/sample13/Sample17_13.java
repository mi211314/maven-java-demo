package com.java.demo.chapter17.sample13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @Description: Sample17_13
 * @Author: miaolei
 * @Date: 2019/6/5 22:36
 */
public class Sample17_13 {

    private static final Logger logger = LoggerFactory.getLogger(Sample17_13.class);

    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<String> blockingDeque = new LinkedBlockingDeque<>(8);
        for (int i = 0; i < 8; i++) {
            blockingDeque.putFirst(i + "");
        }
        logger.info("恭喜你，成功向栈中插入8个元素！！！");
        for (int i = 8; i < 16; i++) {
            blockingDeque.putFirst(i + "");
        }
        logger.info("恭喜你，又成功向栈中插入8个元素！！！");
    }

}
