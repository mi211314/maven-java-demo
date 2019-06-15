package com.java.demo.chapter14.sample12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * @Description: MyEntry
 * @Date: 2019/4/23 07:24
 */
public class MyEntry implements Comparable<MyEntry> {

    private static final Logger logger = LoggerFactory.getLogger(MyEntry.class);

    private int size;

    public MyEntry() {

    }

    public MyEntry(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "size=" + size +
                '}';
    }

    @Override
    public int compareTo(MyEntry o) {
        logger.info("{}与{} compareTo比！！！", this.toString(), o.toString());
        return this.size - o.size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MyEntry myEntry = (MyEntry) o;
        logger.info("{}与{} equals比较！！！", this.toString(), myEntry.toString());
        return size == myEntry.size;
    }

    @Override
    public int hashCode() {
        int hashCode = Objects.hash(size);
        logger.info("{} hashCode!!!", this.toString());
        return hashCode;
    }

}
