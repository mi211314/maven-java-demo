package com.java.demo.chapter15.sample16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: OuterInterfaceImpl
 * @Date: 2019/5/3 17:39
 */
public class OuterInterfaceImpl implements OuterInterface {

    private static final Logger logger = LoggerFactory.getLogger(OuterInterfaceImpl.class);

    @Override
    public void outShow() {
        logger.info("恭喜你，这个类成功地实现了外部接口！！！");
    }

}
