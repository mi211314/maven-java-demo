package com.java.demo.chapter17.sample9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description:
 * @Author: miaolei
 * @Date: 2019/6/4 07:25
 */
public class Sample17_9 {

    public static void main(String[] args) {
        MyResourcePool mrp = new MyResourcePool(10);
        ExecutorService threadPool = Executors.newFixedThreadPool(4);
        threadPool.execute(new MyTask("Task1", mrp, 8));
        threadPool.execute(new MyTask("Task2", mrp, 4));
        threadPool.execute(new MyTask("Task3", mrp, 1));
    }

}
