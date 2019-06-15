package com.java.demo.chapter14.sample26;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description: Sample14_26
 * @Date: 2019/5/3 11:36
 */
public class Sample14_26 {

    private static final Logger logger = LoggerFactory.getLogger(Sample14_26.class);

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            l1.add(i);
            l2.add(i + 50);
        }
        logger.info("========================copy========================");
        logger.info("方法使用前元素为：{}", l1);
        Collections.copy(l1, l2);
        logger.info("方法使用后元素为：{}", l1);

        logger.info("=====================disjoint=====================");
        logger.info("方法使用前元素为：{}", l1);
        if (Collections.disjoint(l1, l2)) {
            logger.info("列表l1与l2中有相同的元素！！！");
        }

        logger.info("=====================addAll======================");
        logger.info("方法使用前元素为：{}", l1);
        Collections.addAll(l1, new Integer[]{88888, 99999});
        logger.info("方法使用后元素为：{}", l1);

        logger.info("=====================fill=======================");
        logger.info("方法使用前元素为：{}", l2);
        Collections.fill(l2, 0);
        logger.info("方法使用后元素为：{}", l2);

        logger.info("==================frequency=================");
        int i = Collections.frequency(l2, 0);
        logger.info("l2中有元素0 {}个！！！", i);

        logger.info("================replaceAll===================");
        logger.info("方法使用前元素为:{}", l2);
        Collections.replaceAll(l2, 0, 3);
        logger.info("方法使用后元素为：{}", l2);

        logger.info("===================reverse===================");
        logger.info("方法使用前元素为：{}", l1);
        Collections.reverse(l1);
        logger.info("方法使用后元素为：{}", l1);

        logger.info("====================rotate===================");
        logger.info("方法使用前元素为：{}", l1);
        Collections.rotate(l1, 6);
        logger.info("方法使用后元素为：{}", l1);

        logger.info("====================swap======================");
        logger.info("方法使用前元素为：{}", l1);
        Collections.swap(l1, 6, 10);
        logger.info("方法使用后元素为：{}", l1);
    }

}
