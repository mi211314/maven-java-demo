package com.java.demo.chapter10.sample16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyClassFather
 *
 * @Date: 2019/1/27 22:35
 */
public class MyClassFather {

    private static final Logger logger = LoggerFactory.getLogger(MyClassFather.class);

    public MyClassFather() {
        logger.info("执行要创建对象类父类的构造器！！！");
    }

}
