package com.java.demo.chapter6.sample2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample2
 *
 * @Date: 2018/10/14 23:16
 */
public class Sample2 {

    private static final Logger logger = LoggerFactory.getLogger(Sample2.class);

    private boolean booleanMember;

    private byte byteMember;

    private short shortMember;

    private char charMember;

    private int intMember;

    private long longMember;

    private float floatMember;

    private double doubleMember;

    public static void main(String[] args) {
        Sample2 ref = new Sample2();
        logger.info("booleanMember={}, byteMember={}, shortMember={}, charMember={}," +
                        "intMember={}, longMember={}, floatMember={}, doubleMember={}",
                ref.booleanMember, ref.byteMember, ref.shortMember, ref.charMember,
                ref.intMember, ref.longMember, ref.floatMember, ref.doubleMember);
    }

}
