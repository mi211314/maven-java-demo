package com.java.demo.chapter15.sample15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: OuterClass
 * @Date: 2019/5/3 17:26
 */
public class OuterClass {

    private static final Logger logger = LoggerFactory.getLogger(OuterClass.class);

    public interface InnerInterface {
        void show();
    }

    public class InnerClass implements InnerInterface {

        @Override
        public void show() {
            logger.info("这里是内部类中的方法，该内部类实现了私有内部接口InnerInterface！！！");
        }
    }

    public InnerInterface getIn() {
        return new InnerClass();
    }
}
