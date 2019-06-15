package com.java.demo.chapter9.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample9_10
 *
 * @Date: 2018/12/18 07:33
 */
public class Sample9_10 {

    private static final Logger logger = LoggerFactory.getLogger(Sample9_10.class);

    public static void main(String[] args) {
        SeaPlane sp = new SeaPlane();
        Bird b = new Bird();
        logger.info("水上飞机执行的动作");
        sp.fly();
        sp.consume();
        sp.cruise();
        logger.info("鸟执行的动作");
        b.fly();
        b.eat();
    }

}
