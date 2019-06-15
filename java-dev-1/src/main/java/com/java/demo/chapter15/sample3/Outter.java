package com.java.demo.chapter15.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Outter
 * @Date: 2019/5/3 15:27
 */
public class Outter {

    private static final Logger logger = LoggerFactory.getLogger(Outter.class);

    private int x = 100;

    class Inner {

        public void show() {
            logger.info("外部类的成员变量x的值为：{}！！！", x);
        }

    }

}
