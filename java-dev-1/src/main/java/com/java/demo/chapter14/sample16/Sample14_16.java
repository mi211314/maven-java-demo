package com.java.demo.chapter14.sample16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * @Description: Sample14_16
 * @Date: 2019/4/29 07:26
 */
public class Sample14_16 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_16.class);

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(new Integer(97005), "Tom");
        hm.put(new Integer(97003), "Jerry");
        hm.put(new Integer(97004), "Lucy");
        hm.put(new Integer(97001), "Smith");
        hm.put(new Integer(97002), "Jc");
        logger.info("这里是HashMap操作前的结果：{}", hm);
        hm.remove(new Integer(97001));
        hm.put(new Integer(97002), "David");
        logger.info("这里是HashMap操作后的结果：{}", hm);
        String str = hm.get(97003);
        logger.info("键97003对应的值为：{}，长度为：{}。", str, str.length());
    }

}
