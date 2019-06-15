package com.java.demo.chapter17.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;

/**
 * @Description: MyCallableImpl
 * @Author: miaolei
 * @Date: 2019/6/3 21:18
 */
public class MyCallableImpl implements Callable<String> {

    private static final Logger logger = LoggerFactory.getLogger(MyCallableImpl.class);

    private String name;

    public MyCallableImpl(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        logger.info("{}任务成功执行！！！", name);
        return "恭喜你，任务成功执行，我是返回消息！！！";
    }

}
