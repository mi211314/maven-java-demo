package com.java.demo.chapter10.sample16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyClass
 *
 * @Date: 2019/1/27 22:37
 */
public class MyClass extends MyClassFather {

    private static final Logger logger = LoggerFactory.getLogger(MyClass.class);

    private Unstatic u = new Unstatic();

    private final UnstaticFinal uf = new UnstaticFinal();

    {
        logger.info("执行非静态语句块！！！");
    }

    static {
        logger.info("执行静态语句块！！！");
    }

    static final StaticFinal sf = new StaticFinal();

    static Static s = new Static();

    public MyClass() {
        logger.info("执行要创建对象类的构造器！！！");
    }

}
