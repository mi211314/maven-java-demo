package com.java.demo.chapter16.sample9;

/**
 * @Description: Producer
 * @Author: miaolei
 * @Date: 2019/5/13 22:36
 */
public class Producer extends Thread {

    private int produceNum;

    private BreadContainer bc;

    public Producer() {

    }

    public Producer(int produceNum, BreadContainer bc, String producerName) {
        this.produceNum = produceNum;
        this.bc = bc;
        this.setName(producerName);
    }

    @Override
    public void run() {
        bc.produceBread(produceNum, this.getName());
    }

}
