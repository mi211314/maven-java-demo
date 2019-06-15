package com.java.demo.chapter12.sample14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: MyClass
 *
 * @Date: 2019/4/8 21:57
 */
public class MyClass {

    private static final Logger logger = LoggerFactory.getLogger(MyClass.class);

    public void doLowLevelStaff(int a) throws MyExceptionFromLowLevel {
        if (a > 50) {
            logger.info("恭喜你，低层方法执行成功！！！");
        } else {
            logger.info("低层发生事故，上报！！！");
            throw new MyExceptionFromLowLevel("值不大于50，发生事故！！！");
        }
    }

    public void doMiddleLevelStaff() throws MyExceptionToHighLevel {
        try {
            int value = (int) Math.round(Math.random() * 100);
            logger.info("调用值为：{}。", value);
            doLowLevelStaff(value);
        } catch (MyExceptionFromLowLevel e) {
            logger.error("发生事故，中层先进行一些处理，然后上报到上层！！！");
            throw new MyExceptionToHighLevel("有事故发生，请上层处理！！！");
        }
    }

    public void doHighLevelStaff() {
        try {
            doMiddleLevelStaff();
        } catch (MyExceptionToHighLevel e) {
            logger.error("上层最终处理事故！！！");
        }
    }

}
