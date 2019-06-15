package com.java.demo.chapter12.sample11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Father
 *
 * @Date: 2019/3/26 21:47
 */
public class Father {

    private static final Logger logger = LoggerFactory.getLogger(Father.class);

    public void myFunction() throws Exception {
        logger.info("这里是父类方法，该方法没有异常抛出！！！");
    }

}
