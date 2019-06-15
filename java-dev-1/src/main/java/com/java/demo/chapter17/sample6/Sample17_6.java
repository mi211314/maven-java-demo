package com.java.demo.chapter17.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Description: Sample17_6
 * @Author: miaolei
 * @Date: 2019/6/3 21:21
 */
public class Sample17_6 {

    private static final Logger logger = LoggerFactory.getLogger(Sample17_6.class);

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        Future<String> future = threadPool.submit(new MyCallableImpl("TaskA"));
        try {
            logger.info("{}", future.get());
        } catch (InterruptedException | ExecutionException e) {
            logger.error(e.getMessage(), e);
        }
        threadPool.shutdown();
    }

}
