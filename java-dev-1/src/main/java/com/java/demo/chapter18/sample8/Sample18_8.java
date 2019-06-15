package com.java.demo.chapter18.sample8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.ref.SoftReference;

/**
 * @Description:
 * @Author: miaolei
 * @Date: 2019/6/15 13:34
 */
public class Sample18_8 {

    private static final Logger logger = LoggerFactory.getLogger(Sample18_8.class);

    public static void main(String[] args) {
        MySoftObject mso = new MySoftObject("MSO");
        SoftReference<MySoftObject> sr = new SoftReference<>(mso);
        mso = null;
        sr.get().show();
        logger.info("第一次进行垃圾收集！！！");
        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        }
        sr.get().show();
        int size = 100;
        String[] sa = new String [size];
        for (int i = 0; i < size; i++) {
            sa[i] = new String("Hello World!!!");
        }
    }

}
