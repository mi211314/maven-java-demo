package com.java.demo.chapter16.sample7;

/**
 * @Description: Sample16_7
 * @Date: 2019/5/4 17:34
 */
public class Sample16_7 {

    public static void main(String[] args) {
        Runnable mc = new MyCommon();
        Runnable md = new MyDaemon();
        Thread tc = new Thread(mc);
        Thread td = new Thread(md);
        td.setDaemon(true);
        tc.start();
        td.start();
    }

}
