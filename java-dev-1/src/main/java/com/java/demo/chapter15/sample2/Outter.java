package com.java.demo.chapter15.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Outter
 * @Date: 2019/5/3 15:22
 */
public class Outter {

    private static final Logger logger = LoggerFactory.getLogger(Outter.class);

    class Inner {

        public void show() {
            logger.info("恭喜你，创建了内部类的对象，并且调用了内部类中的方法！！！");
        }

    }

}
