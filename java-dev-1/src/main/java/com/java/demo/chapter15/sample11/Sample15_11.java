package com.java.demo.chapter15.sample11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 * @Date: 2019/5/3 16:11
 */
public class Sample15_11 {

    private static final Logger logger = LoggerFactory.getLogger(Sample15_11.class);

    public static void main(String[] args) {
        Father f = new Father() {
            @Override
            public void show() {
                logger.info("恭喜你，成功地创建了匿名内部类的对象！！！");
            }
        };
        f.show();
    }
}
