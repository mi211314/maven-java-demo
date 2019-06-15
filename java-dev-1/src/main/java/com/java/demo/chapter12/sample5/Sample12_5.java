package com.java.demo.chapter12.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample12_5
 *
 * @Date: 2019/3/26 21:18
 */
public class Sample12_5 {

    private static final Logger logger = LoggerFactory.getLogger(Sample12_5.class);

    public static void main(String[] args) {
        try {
            logger.info("这里是try块，被监视的代码！！！");
        } finally {
            logger.info("这里是finally块，无论是否抛出异常，这里总能执行！！！");
        }
    }

}
