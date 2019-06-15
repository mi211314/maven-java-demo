package com.java.demo.chapter15.sample12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample15_12
 * @Date: 2019/5/3 16:59
 */
public class Sample15_12 {

    private static final Logger logger = LoggerFactory.getLogger(Sample15_12.class);

    public static void main(String[] args) {
        MyInterface mi = new MyInterface() {
            @Override
            public void show() {
                logger.info("恭喜你创建了匿名内部类的对象，该类实现了MyInterface接口！！！");
            }
        };
        mi.show();
    }

}
