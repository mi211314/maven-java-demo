package com.java.demo.chapter17.sample8;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Description: MyResource
 * @Author: miaolei
 * @Date: 2019/6/4 07:06
 */
public class MyResource {

    public ReadWriteLock lock = new ReentrantReadWriteLock();

    private String msg = "init";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
