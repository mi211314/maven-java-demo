package com.java.demo.chapter15.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Outter
 * @Date: 2019/5/3 16:03
 */
public class Outter {

    private static final Logger logger = LoggerFactory.getLogger(Outter.class);

    static class Inner {
        public void show() {
            logger.info("恭喜你，成功地创建了静态内部类的对象！！！");
        }
    }

    public void getInner() {
        Inner i = new Inner();
        i.show();
    }

}
