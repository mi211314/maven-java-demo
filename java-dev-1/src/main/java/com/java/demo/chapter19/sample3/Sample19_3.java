package com.java.demo.chapter19.sample3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample19_3
 * @Author: miaolei
 * @Date: 2019/6/15 14:18
 */
public class Sample19_3 {

    private static final Logger logger = LoggerFactory.getLogger(Sample19_3.class);

    public static int getRandom() {
        int random = (int) (Math.random() * 100);
        return random;
    }

    public static void swapData(int[] array, int pos, int anotherPos) {
        int temp = array[pos];
        array[pos] = array[anotherPos];
        array[anotherPos] = temp;
    }

    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        int[] anotherArray = new int[size];
        for (int i = 0; i < 10; i++) {
            array[i] = getRandom();
        }
        for (int i = 0; i < 10; i++) {
            anotherArray[i] = getRandom();
        }
        logger.info("排序前数组各个元素依次为：{}", array);
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swapData(array, j, j + 1);
                }
            }
        }
        logger.info("从小到大对数组进行排序：{}", array);

        logger.info("排序前数组各个元素依次为：{}", anotherArray);
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (anotherArray[j] < anotherArray[j + 1]) {
                    swapData(anotherArray, j, j + 1);
                }
            }
        }
        logger.info("从大到小对数组进行排序：{}", anotherArray);
    }

}
