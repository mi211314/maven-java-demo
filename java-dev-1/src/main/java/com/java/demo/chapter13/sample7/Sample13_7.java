package com.java.demo.chapter13.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample13_7
 *
 * @Date: 2019/4/11 22:30
 */
public class Sample13_7 {

    private static final Logger logger = LoggerFactory.getLogger(Sample13_7.class);

    public static void main(String[] args) {
        String s = "JavaSE7.0";
        StringBuffer sb = new StringBuffer("JavaSE7.0");
        String str = "核心技术大全";
        s.concat(str);
        sb.append(str);
        logger.info("对String对象s以及StringBuffer对象sb做字符串连接操作，结果如下：");
        logger.info("操作后s = {}", s);
        logger.info("操作后sb = {}", sb);
    }

}
