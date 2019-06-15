package com.java.demo.chapter17.sample12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Description: Sample17_12
 * @Author: miaolei
 * @Date: 2019/6/5 22:30
 */
public class Sample17_12 {

    private static final Logger logger = LoggerFactory.getLogger(Sample17_12.class);

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<MyElement> bq = new ArrayBlockingQueue<>(10);
        for (int i = 0; i < 10; i++) {
            bq.put(new MyElement("No" + i));
        }
        logger.info("成功向队列中添加10个元素！！！");
        for (int i = 10; i < 20; i++) {
            bq.put(new MyElement("No" + i));
        }
        logger.info("再次成功向队列中添加10个元素！！！");
    }

}
