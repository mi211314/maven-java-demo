package com.java.demo.chapter15.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Outter
 * @Date: 2019/5/3 15:31
 */
public class Outter {

    private static final Logger logger = LoggerFactory.getLogger(Outter.class);

    private int x = 100;

    class Inner {

        private void show() {
            logger.info("恭喜你，成功调用了内部类中的私有方法！！！");
        }

    }

    public void getInnerShow() {
        Inner i = new Inner();
        i.show();
    }

}
