package com.java.demo.chapter10.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Bird
 *
 * @Date: 2019/1/13 22:50
 */
public class Bird extends Animal {

    private static final Logger logger = LoggerFactory.getLogger(Bird.class);

    public Bird() {
        super();
        logger.info("我是Bird类的无参构造器！！！");
    }

    public Bird(int a) {
        super(a);
        logger.info("执行Bird类的有一个int参数的构造器，本次收到的参数值为：{}！！！", a);
    }

}
