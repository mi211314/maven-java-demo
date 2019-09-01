package com.java.map.demo.sample1;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * @Description: Test
 * @Author: miaolei
 * @Date: 2019/8/18 20:39
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        int threadNumber = 1;
        log.info("单线程运行结果：");
        for (int i = 0; i < 5; i++) {
            log.info("第{}次运行结果：{}", i + 1, testAdd(threadNumber));
        }

        threadNumber = 5;
        log.info("多线程运行结果：");
        for (int i = 0; i < 5; i++) {
            log.info("第{}次运行结果：{}" , i + 1, testAdd(threadNumber));
        }
    }

    private static int testAdd(int threadNumber) {
        ConcurrentMap<Integer, Integer> map = new ConcurrentHashMap<>();
        map.put(1, 0);
        ExecutorService pool = Executors.newCachedThreadPool();
        for (int i = 0; i < threadNumber; i++) {
            pool.execute(new TestTask(map));
        }
        pool.shutdown();
        try {
            pool.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            log.error(e.getMessage(), e);
        }
        return map.get(1);
    }

}
