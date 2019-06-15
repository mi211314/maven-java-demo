package com.java.demo.chapter8.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 *
 * @Date: 2018/11/25 21:47
 */
public class Sample8_8 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_8.class);

    public static void main(String[] args) {
        Car c = new Truck();
        logger.info("访问的成员为：{}",  c.aMember);
        logger.info("访问的成员为：{}", ((Truck) c).aMember);
    }

}
