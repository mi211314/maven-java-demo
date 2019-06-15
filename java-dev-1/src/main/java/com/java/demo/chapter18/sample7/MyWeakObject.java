package com.java.demo.chapter18.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyWeakObject
 * @Author: miaolei
 * @Date: 2019/6/15 10:49
 */
public class MyWeakObject {

    private static final Logger logger = LoggerFactory.getLogger(MyWeakObject.class);

    private String name;

    public MyWeakObject(String name) {
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
