package com.java.demo.chapter18.sample7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/**
 * @Description: Sample18_7
 * @Author: miaolei
 * @Date: 2019/6/15 10:49
 */
public class Sample18_7 {

    private static final Logger logger = LoggerFactory.getLogger(Sample18_7.class);

    public static void main(String[] args) {
        logger.info("========弱引用对象垃圾收集的情况==========");
        MyWeakObject mwo = new MyWeakObject("MyWeakObject1");
        WeakReference<MyWeakObject> wr = new WeakReference<>(mwo);
        mwo = null;
        wr.get().show();
        logger.info("第一次进行垃圾收集！！！");
        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        }
        if (wr.get() != null) {
            wr.get().show();
        }

        logger.info("==================弱引用Map==============");
        WeakHashMap<MyWeakObject, String> whm = new WeakHashMap<>();
        MyWeakObject mwo2 = new MyWeakObject("MyWeakObject2");
        whm.put(mwo2, "xxxxxxxx");
        mwo2 = null;
        whm.keySet().iterator().next().show();
        logger.info("第二次进行垃圾收集！！！");
        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        }
    }

}
