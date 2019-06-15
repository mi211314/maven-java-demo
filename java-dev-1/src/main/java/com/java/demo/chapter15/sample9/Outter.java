package com.java.demo.chapter15.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Outter
 * @Date: 2019/5/3 15:56
 */
public class Outter {

    private static final Logger logger = LoggerFactory.getLogger(Outter.class);

    static int x = 100;

    public static void getInner() {
        class Inner {
            public void show() {
                logger.info("访问方法中的局部变量，x = {}", x);
            }
        }
        Inner i = new Inner();
        i.show();
    }

}
