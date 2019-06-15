package com.java.demo.chapter8.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_2
 *
 * @Date: 2018/11/25 20:51
 */
public class Sample8_2 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_2.class);

    public static void main(String[] args) {
        Car c = new Car();
        logger.info("轿车所使用轮胎的颜色为：{}", c.getT().getColor());
        logger.info("轿车所使用轮胎的材料为：{}", c.getT().getMaterial());
    }

}
