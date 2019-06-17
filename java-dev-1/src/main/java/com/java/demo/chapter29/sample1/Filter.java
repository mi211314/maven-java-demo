package com.java.demo.chapter29.sample1;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @Description: Filter
 * @Author: miaolei
 * @Date: 2019/6/16 21:41
 */
public class Filter implements FilenameFilter {

    private String extent;

    public Filter(String extent) {
        this.extent = extent;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith("." + extent);
    }

}
