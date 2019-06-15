package com.java.demo.chapter18.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Son
 * @Author: miaolei
 * @Date: 2019/6/15 10:07
 */
public class Son extends Father {

    private static final Logger logger = LoggerFactory.getLogger(Son.class);

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        logger.info("恭喜你，这里是Son类，清理前成功调用了finalize方法！！！");
    }

}
