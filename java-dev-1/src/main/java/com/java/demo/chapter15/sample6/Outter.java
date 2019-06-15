package com.java.demo.chapter15.sample6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Outter
 * @Date: 2019/5/3 15:41
 */
public class Outter {

    private static final Logger logger = LoggerFactory.getLogger(Outter.class);

    public void getInner() {
        class Inner {
            public void show() {
                logger.info("恭喜你，定义并创建了局部内部类的对象！！！");
            }
        }
        Inner i = new Inner();
        i.show();
    }

}
