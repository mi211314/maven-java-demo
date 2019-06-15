package com.java.demo.chapter14.sample18;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;

/**
 * @Description: Sample14_18
 * @Date: 2019/4/29 07:40
 */
public class Sample14_18 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_18.class);

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(Integer.valueOf(97005), "Tom");
        lhm.put(Integer.valueOf(97003), "Jerry");
        lhm.put(Integer.valueOf(97004), "Lucy");
        logger.info("这里是LinkedHashMap操作前的结果：{}", lhm);
        lhm.put(Integer.valueOf(97003), "David");
        boolean b = lhm.containsValue("Jerry");
        logger.info("{}", b ? "存在！！！" : "不存在！！！");
        logger.info("这里是LinkedHashMap操作后的结果：{}", lhm);
    }

}
