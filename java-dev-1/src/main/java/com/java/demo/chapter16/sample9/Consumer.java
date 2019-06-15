package com.java.demo.chapter16.sample9;

/**
 * @Description: Consumer
 * @Author: miaolei
 * @Date: 2019/5/13 22:39
 */
public class Consumer extends Thread {

    private int consumeNum;

    private BreadContainer bc;

    public Consumer() {

    }

    public Consumer(int consumeNum, BreadContainer bc, String consumerName) {
        this.consumeNum = consumeNum;
        this.bc = bc;
        this.setName(consumerName);
    }

    @Override
    public void run() {
        bc.consumeBread(consumeNum, this.getName());
    }

}
