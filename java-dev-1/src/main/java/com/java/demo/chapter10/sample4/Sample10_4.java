package com.java.demo.chapter10.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample10_4
 *
 * @Date: 2019/1/7 21:33
 */
public class Sample10_4 {

    private static final Logger logger = LoggerFactory.getLogger(Sample10_4.class);

    public static void main(String[] args) {
        Animal a = new Animal("tom", 40);
        logger.info("我的名字叫{}，我的身体长{}厘米", a.name, a.size);
    }

}
