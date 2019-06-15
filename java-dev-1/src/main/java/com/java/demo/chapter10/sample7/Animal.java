package com.java.demo.chapter10.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Animal
 *
 * @Date: 2019/1/13 22:11
 */
public class Animal {

    private static final Logger logger = LoggerFactory.getLogger(Animal.class);

    public Animal() {
        logger.info("我是Animal类的无参构造器！！！");
    }

    public Animal(int a) {
        logger.info("执行Animal类的有一个参数的构造器，本次收到的参数值为：{}！！！", a);
    }

}
