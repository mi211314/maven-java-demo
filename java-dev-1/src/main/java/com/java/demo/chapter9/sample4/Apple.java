package com.java.demo.chapter9.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Apple
 *
 * @Date: 2018/12/23 15:32
 */
public class Apple extends Fruit implements Food {

    private static final Logger logger = LoggerFactory.getLogger(Apple.class);

    public void doEat() {
        logger.info("我是苹果，我属于水果，我可以充当食物被吃掉！！！");
    }

}
