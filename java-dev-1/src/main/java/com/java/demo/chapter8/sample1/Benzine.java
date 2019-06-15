package com.java.demo.chapter8.sample1;

/**
 * @Description: Benzine
 *
 * @Date: 2018/11/25 20:37
 */
public class Benzine {

    private int cubage = 100;

    private final int limit = 80;

    public boolean isEnough() {
        if (cubage > limit) {
            return true;
        } else {
            return false;
        }
    }

}
