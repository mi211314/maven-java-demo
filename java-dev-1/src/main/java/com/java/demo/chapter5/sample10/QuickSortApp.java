package com.java.demo.chapter5.sample10;

import java.util.Random;

/**
 * @Description: QuickSortApp
 *
 * @Date: 2018/9/19 22:43
 */
public class QuickSortApp {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int maxSize = 16;
        Sample10 arr = new Sample10(maxSize);
        for (int i = 0; i < maxSize; i++) {
            double n = RANDOM.nextInt(99);
            arr.insert(n);
        }
        arr.display();
        arr.quickSort();
        arr.display();
    }

}
