package com.java.demo.chapter18.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Rubbish
 * @Author: miaolei
 * @Date: 2019/6/15 10:31
 */
public class Rubbish {

    private static final Logger logger = LoggerFactory.getLogger(Rubbish.class);

    Rubbish brother;

    private String name;

    public Rubbish() {

    }

    public Rubbish(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        logger.info("{}成为垃圾对象，并被收集！！！", this.name);
    }

}
