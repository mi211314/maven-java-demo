package com.java.demo.chapter17.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Description: Sample17_5
 * @Author: miaolei
 * @Date: 2019/6/3 21:06
 */
public class Sample17_5 {

    private static final Logger logger = LoggerFactory.getLogger(Sample17_5.class);

    public static void main(String[] args) {
        BlockingQueue workQueue = new ArrayBlockingQueue(3);
        ThreadPoolExecutor myThreadPool = new ThreadPoolExecutor(2, 4,
                100, TimeUnit.MILLISECONDS, workQueue);
        MyTask mt1 = new MyTask("MT1");
        MyTask mt2 = new MyTask("MT2");
        MyTask mt3 = new MyTask("MT3");
        MyTask mt4 = new MyTask("MT4");
        myThreadPool.execute(mt1);
        myThreadPool.execute(mt2);
        myThreadPool.execute(mt3);
        myThreadPool.execute(mt4);
        logger.info("线程池的实际大小为：{}", myThreadPool.getPoolSize());
        myThreadPool.shutdown();
    }

}
