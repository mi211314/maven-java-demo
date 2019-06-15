package com.java.demo.chapter14.sample20;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * @Description: Sample14_20
 * @Date: 2019/5/3 10:16
 */
public class Sample14_20 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_20.class);

    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(10001, "Tom");
        hm.put(10003, "Jerry");
        hm.put(10002, "John");
        hm.put(10004, "Lily");

        Set<Integer> keySet = hm.keySet();
        Iterator<Integer> il = keySet.iterator();
        logger.info("===========通过键集合对Map进行遍历=============");
        while (il.hasNext()) {
            Integer key = il.next();
            String value = hm.get(key);
            logger.info("键：{}，值：{}，值长度：{}。", key, value, value.length());
        }

        Collection<String> values = hm.values();
        logger.info("=============用for-each循环对所有值进行遍历================");
        for (String value : values) {
            logger.info("值：{}，值长度：{}。", value, value.length());
        }
    }

}
