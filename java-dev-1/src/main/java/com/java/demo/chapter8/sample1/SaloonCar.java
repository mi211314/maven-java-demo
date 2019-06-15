package com.java.demo.chapter8.sample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: SaloonCar
 *
 * @Date: 2018/11/25 20:36
 */
public class SaloonCar {

    private static final Logger logger = LoggerFactory.getLogger(SaloonCar.class);

    public void startUp(Benzine b) {
        if (b.isEnough()) {
            logger.info("恭喜你，汽油的储备量充足，汽车可以启动！！！");
        }
    }
}
