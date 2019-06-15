package com.java.demo.chapter15.sample16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: InnerInterfaceImpl
 * @Date: 2019/5/3 17:37
 */
public class InnerInterfaceImpl implements OuterInterface.InnerInterface {

    private static final Logger logger = LoggerFactory.getLogger(InnerInterfaceImpl.class);

    @Override
    public void inShow() {
        logger.info("恭喜你，这个类成功地实现了内部接口！！！");
    }

}
