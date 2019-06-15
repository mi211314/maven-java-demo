package com.java.demo.chapter13.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyClass
 *
 * @Date: 2019/4/11 22:37
 */
public class MyClass {

    private static final Logger logger = LoggerFactory.getLogger(MyClass.class);

    public MyClass a() {
        logger.info("恭喜你，成功使用了方法链，现在调用到了方法a");
        return this;
    }

    public MyClass b() {
        logger.info("恭喜你，成功使用了方法链，现在调用到了方法b");
        return this;
    }

    public void c() {
        logger.info("恭喜你，成功使用了方法链，现在调用到了方法c");
    }

}
