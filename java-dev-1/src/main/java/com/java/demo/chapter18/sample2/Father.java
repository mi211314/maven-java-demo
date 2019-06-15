package com.java.demo.chapter18.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Father
 * @Author: miaolei
 * @Date: 2019/6/15 10:06
 */
public class Father {

    private static final Logger logger = LoggerFactory.getLogger(Father.class);

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        logger.info("恭喜你，这里是Father类，清理前成功调用了finalize方法！！！");
    }

}
