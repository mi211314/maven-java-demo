package com.java.demo.chapter14.sample15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;

/**
 * @Description: Sample14_15
 * @Date: 2019/4/29 07:16
 */
public class Sample14_15 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_15.class);

    public static void main(String[] args) {
        HashSet<MyEntryForEach> hs = new HashSet<>();
        hs.add(new MyEntryForEach(23));
        hs.add(new MyEntryForEach(24));
        hs.add(new MyEntryForEach(25));
        hs.add(new MyEntryForEach(27));
        hs.add(new MyEntryForEach(29));
        logger.info("这里是HashSet操作前的结果：{}", hs);
        for (MyEntryForEach entry : hs) {
            entry.setIntMember(55);
        }
        logger.info("这里是HashSet操作后的结果：{}", hs);
    }

}
