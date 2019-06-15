package com.java.demo.chapter14.sample9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;

/**
 * @Description: Sample14_9
 * @Date: 2019/4/23 06:55
 */
public class Sample14_9 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_9.class);

    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        logger.info("======================================");
        logger.info("向空HashSet中添加名字为tom的元素");
        hs.add(new Student("tom"));
        logger.info("此时HashSet里的元素为：{}", hs);
        logger.info("======================================");
        logger.info("向HashSet中添加名字为wjc的元素");
        hs.add(new Student("wjc"));
        logger.info("此时HashSet里的元素为：{}", hs);
        logger.info("=======================================");
        logger.info("向HashSet中添加名字为wyf的元素");
        hs.add(new Student("wyf"));
        logger.info("此时HashSet里的元素为：{}", hs);
        logger.info("=======================================");
        logger.info("向HashSet中再次添加名字为wjc的元素");
        hs.add(new Student("wjc"));
        logger.info("此时HashSet里的元素为：{}", hs);
        logger.info("=======================================");
    }

}
