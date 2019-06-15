package com.java.demo.chapter9.sample4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 *
 * @Date: 2018/12/23 15:35
 */
public class Beef extends Meat implements Food {

    private static final Logger logger = LoggerFactory.getLogger(Beef.class);

    public void doEat() {
        logger.info("我是牛肉，我属于肉类，我可以充当食物被吃掉！！！");
    }

}
