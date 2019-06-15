package com.java.demo.chapter15.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Outter
 * @Date: 2019/5/3 15:36
 */
public class Outter {

    private static final Logger logger = LoggerFactory.getLogger(Outter.class);

    int x = 100;

    class Inner {

        int x = 10000;

        public void show() {
            logger.info("访问外部类Outter中的成员变量，x = {}。", Outter.this.x);
            logger.info("访问内部类Innter中的成员变量，x = {}。", this.x);
        }

    }

}
