package com.java.demo.chapter17.sample3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description:
 * @Author: miaolei
 * @Date: 2019/5/17 07:49
 */
public class Sample17_3 {

    public static void main(String[] args) {
        ExecutorService shrinkTreadPool = Executors.newCachedThreadPool();
        MyShrinkTask mt1 = new MyShrinkTask("MT1");
        MyShrinkTask mt2 = new MyShrinkTask("MT2");
        MyShrinkTask mt3 = new MyShrinkTask("MT3");
        shrinkTreadPool.execute(mt1);
        shrinkTreadPool.execute(mt2);
        shrinkTreadPool.execute(mt3);
        shrinkTreadPool.shutdown();
    }

}
