package com.java.demo.chapter18.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: CallBack
 * @Author: miaolei
 * @Date: 2019/6/15 10:11
 */
public class CallBack {

    private static final Logger logger = LoggerFactory.getLogger(CallBack.class);

    static CallBack help;

    public void show() {
        logger.info("show方法还能访问，该对象没有被垃圾收集！！！");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        logger.info("第一次收集CallBack对象，调用了Finalize方法！！！");
        CallBack.help = this;
    }

}
