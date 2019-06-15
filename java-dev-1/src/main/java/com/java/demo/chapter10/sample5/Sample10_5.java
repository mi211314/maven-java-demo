package com.java.demo.chapter10.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample10_5
 *
 * @Date: 2019/1/7 22:00
 */
public class Sample10_5 {

    private static final Logger logger = LoggerFactory.getLogger(Sample10_5.class);

    private static final String DESC = "我的名字叫{}，我的身体长{}厘米";

    public static void main(String[] args) {
        Animal a = new Animal("tom", 40);
        Animal b = new Animal("tom");
        Animal c = new Animal();
        logger.info(DESC, a.name, a.size);
        logger.info(DESC, b.name, b.size);
        logger.info(DESC, c.name, c.size);
    }

}
