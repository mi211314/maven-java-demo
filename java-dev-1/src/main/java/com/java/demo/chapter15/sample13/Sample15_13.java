package com.java.demo.chapter15.sample13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample15_13
 * @Date: 2019/5/3 17:05
 */
public class Sample15_13 {

    private static final Logger logger = LoggerFactory.getLogger(Sample15_13.class);

    public static void main(String[] args) {
        FatherForInner ffi = new FatherForInner() {
            {
                count = (int) (Math.random() * 100);
            }

            @Override
            void show() {
                logger.info("初始化后count的值为：{}。", count);
            }
        };
        ffi.show();
    }

}
