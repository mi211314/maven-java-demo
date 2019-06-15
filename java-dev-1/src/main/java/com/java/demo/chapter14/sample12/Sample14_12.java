package com.java.demo.chapter14.sample12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.TreeSet;

/**
 * @Description: Sample14_12
 * @Date: 2019/4/23 07:23
 */
public class Sample14_12 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_12.class);

    public static void main(String[] args) {
        TreeSet<MyEntry> ts = new TreeSet<>();
        logger.info("================插入21==============");
        ts.add(new MyEntry(21));
        logger.info("================插入19==============");
        ts.add(new MyEntry(19));
        logger.info("================插入18==============");
        ts.add(new MyEntry(18));
        logger.info("================插入28==============");
        ts.add(new MyEntry(28));
        logger.info("================再次插入21=================");
        ts.add(new MyEntry(21));
        logger.info("====================================");
        logger.info("这里是TreeSet操作后的结果：{}", ts);
    }

}
