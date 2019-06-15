package com.java.demo.chapter17.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyTask
 * @Author: miaolei
 * @Date: 2019/6/4 07:21
 */
public class MyTask implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(MyTask.class);

    private String userName;

    private MyResourcePool mrp;

    private int count;

    public MyTask(String userName, MyResourcePool mrp, int count) {
        this.userName = userName;
        this.mrp = mrp;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            mrp.sp.acquire(count);
            logger.info("{}任务成功申请了{}个资源执行完毕！！！", userName, count);
            Thread.sleep(2000);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            mrp.sp.release(count);
        }
    }

}
