package com.java.map.demo.sample1;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @Description: TestTask
 * @Author: miaolei
 * @Date: 2019/8/18 20:22
 */
public class TestTask implements Runnable {

    private ConcurrentMap<Integer, Integer> map = new ConcurrentHashMap<>();

    public TestTask(ConcurrentMap<Integer, Integer> map) {
        this.map = map;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (map) {
                map.put(1, map.get(1) + 1);
            }
        }
    }

}
