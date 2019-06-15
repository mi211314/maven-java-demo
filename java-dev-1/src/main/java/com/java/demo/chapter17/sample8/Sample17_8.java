package com.java.demo.chapter17.sample8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: Sample17_8
 * @Author: miaolei
 * @Date: 2019/6/4 07:14
 */
public class Sample17_8 {

    public static void main(String[] args) {
        MyResource mr = new MyResource();
        ExecutorService threadPool = Executors.newFixedThreadPool(4);
        threadPool.execute(new MyUser("User1", 0, null, mr));
        threadPool.execute(new MyUser("User2", 0, null, mr));
        threadPool.execute(new MyUser("User3", 1, "Hello World", mr));
    }

}
