package com.java.demo.chapter9.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: SeaPlane
 *
 * @Date: 2018/12/18 07:29
 */
public class SeaPlane extends AirPlane implements Sailer {

    private static final Logger logger = LoggerFactory.getLogger(SeaPlane.class);

    public void cruise() {
        logger.info("我可以用船的方式在水中航行！！！");
    }

}
