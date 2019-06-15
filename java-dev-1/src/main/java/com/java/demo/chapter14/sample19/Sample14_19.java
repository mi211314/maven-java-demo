package com.java.demo.chapter14.sample19;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.TreeMap;

/**
 * @Description: Sample14_19
 * @Date: 2019/5/3 10:05
 */
public class Sample14_19 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_19.class);

    public static void main(String[] args) {
        TreeMap<Integer, String> tmp = new TreeMap<>();
        tmp.put(97004, "Lucy");
        tmp.put(97001, "Smith");
        tmp.put(97002, "Jc");

        TreeMap<Integer, String> tmc = new TreeMap<>(new MyComparator());
        tmc.put(97004, "Lucy");
        tmc.put(97001, "Smith");
        tmc.put(97002, "Jc");

        logger.info("===============================================");
        logger.info("普通的TreeMap中的内容为：{}", tmp);
        logger.info("===============================================");
        logger.info("指定比较器的TreeMap中的内容为：{}", tmc);
        tmp.remove(97001);
        tmp.put(97002, "David");
        logger.info("================================================");
        logger.info("处理后普通TreeMap中的内容：{}", tmp);
    }

}
