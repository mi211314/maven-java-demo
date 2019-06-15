package com.java.demo.chapter14.sample17;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Hashtable;

/**
 * @Description: Sample14_17
 * @Date: 2019/4/29 07:33
 */
public class Sample14_17 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_17.class);

    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(Integer.valueOf(97005), "Tom");
        ht.put(Integer.valueOf(97003), "Jerry");
        ht.put(Integer.valueOf(97004), "Lucy");
        ht.put(Integer.valueOf(97001), "Smith");
        ht.put(Integer.valueOf(97002), "Jc");
        logger.info("这里是Hashtable操作前的结果：{}", ht);
        boolean b = ht.containsKey(97001);
        logger.info("{}", b ? "存在！！！" : "不存在！！！");
        ht.put(Integer.valueOf(97002), "David");
        logger.info("这里是Hashtable操作后的结果：{}", ht);
        String str = ht.get(97003);
        logger.info("键97003对应的值为：{}，长度为：{}", str, str.length());
    }
}
