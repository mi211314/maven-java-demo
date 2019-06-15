package com.java.demo.chapter8.sample19;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_25
 *
 * @Date: 2018/12/16 20:25
 */
public class Sample8_25 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_25.class);

    public static void main(String[] args) {
        UseCar a = new UseCar();
        Vehicle v = new Vehicle();
        Car c = new Car();
        Truck t = new Truck();
        logger.info("用Vehicle类型参数调用：");
        a.show(v);
        logger.info("用Car类型参数调用：");
        a.show(c);
        logger.info("用Truck类型参数调用：");
        a.show(t);
    }

}
