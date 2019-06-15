package com.java.demo.chapter9.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: ProcessorB
 *
 * @Date: 2018/12/23 15:47
 */
public class ProcessorB implements MyListener {

    private static final Logger logger = LoggerFactory.getLogger(ProcessorB.class);

    public void specialProcessEvent() {
        logger.info("我采用B策略处理事件！！！");
    }

}
