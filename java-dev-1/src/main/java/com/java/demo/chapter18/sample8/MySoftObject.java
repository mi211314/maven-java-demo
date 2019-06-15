package com.java.demo.chapter18.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MySoftObject
 * @Author: miaolei
 * @Date: 2019/6/15 13:34
 */
public class MySoftObject {

    private static final Logger logger = LoggerFactory.getLogger(MySoftObject.class);

    private String name;

    public MySoftObject() {

    }

    public MySoftObject(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        logger.info("{}对象满足垃圾收集的条件，被收集！！！", this.name);
    }

    public void show() {
        logger.info("{}对象还可以被调用！！！", this.name);
    }

}
