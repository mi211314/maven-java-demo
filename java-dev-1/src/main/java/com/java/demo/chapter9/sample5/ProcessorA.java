package com.java.demo.chapter9.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: ProcessorA
 *
 * @Date: 2018/12/23 15:46
 */
public class ProcessorA implements MyListener {

    private static final Logger logger = LoggerFactory.getLogger(ProcessorA.class);

    public void specialProcessEvent() {
        logger.info("我采用A策略处理事件！！！");
    }

}
