package com.java.demo.chapter9.sample5;

/**
 * @Description: Sample9_12
 *
 * @Date: 2018/12/23 15:49
 */
public class Sample9_12 {

    public static void main(String[] args) {
        MyMoniter mm = new MyMoniter();
        ProcessorA pa = new ProcessorA();
        ProcessorB pb = new ProcessorB();
        mm.regListener(pa);
        mm.generalProcessEvent();
        mm.regListener(pb);
        mm.generalProcessEvent();
    }

}
