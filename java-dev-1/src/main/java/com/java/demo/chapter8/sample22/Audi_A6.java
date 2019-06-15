package com.java.demo.chapter8.sample22;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Audi_A6
 *
 * @Date: 2018/12/16 21:04
 */
public class Audi_A6 extends Audi {

    private static final Logger logger = LoggerFactory.getLogger(Audi_A6.class);

    @Override
    public void turbo() {
        logger.info("调用了奥迪A6的加速功能！！！");
    }

    @Override
    public void startUp() {
        logger.info("调用了奥迪A6的启动功能！！！");
    }

}
