package com.java.demo.chapter17.sample9;

import java.util.concurrent.Semaphore;

/**
 * @Description: MyResourcePool
 * @Author: miaolei
 * @Date: 2019/6/4 07:19
 */
public class MyResourcePool {

    public Semaphore sp;

    public MyResourcePool(int count) {
        this.sp = new Semaphore(count);
    }

}
