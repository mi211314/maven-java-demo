package com.java.demo.chapter15.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Outter
 * @Date: 2019/5/3 15:51
 */
public class Outter {

    private static final Logger logger = LoggerFactory.getLogger(Outter.class);

    ForInner forInner = null;

    public void getInner() {
        class Inner implements ForInner {

            @Override
            public void sayHello() {
                logger.info("您好，我是局部内部类对象，我还存在！！！");
            }
        }
        forInner = new Inner();
    }
}
