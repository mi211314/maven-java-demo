package com.java.demo.chapter8.sample20;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample8_26
 *
 * @Date: 2018/12/16 20:37
 */
public class Sample8_26 {

    private static final Logger logger = LoggerFactory.getLogger(Sample8_26.class);

    public static void main(String[] args) {
        UseMethod u = new UseMethod();
        logger.info("用null类型参数调用：");
        u.show((A) null);
    }

}
