package com.java.demo.chapter17.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyUser
 * @Author: miaolei
 * @Date: 2019/6/4 07:08
 */
public class MyUser implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(MyUser.class);

    private String userName;

    private int functionCode;

    private String msg;

    private  MyResource mr;

    public MyUser(String userName, int functionCode, String msg, MyResource mr) {
        this.userName = userName;
        this.functionCode = functionCode;
        this.msg = msg;
        this.mr = mr;
    }

    @Override
    public void run() {
        if (functionCode == 0) {
            try {
                mr.lock.readLock().lock();
                logger.info("{}用户成功进行读操作，读出内容为：{}！！！", userName, mr.getMsg());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                logger.error(e.getMessage(), e);
            } finally {
                mr.lock.readLock().unlock();
            }
        } else {
            try {
                mr.lock.writeLock().lock();
                mr.setMsg(msg);
                logger.info("{}用户成功进行写操作，写入后内容：{}！！！", userName, mr.getMsg());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                logger.error(e.getMessage(), e);
            } finally {
                mr.lock.writeLock().unlock();
            }
        }
    }

}
