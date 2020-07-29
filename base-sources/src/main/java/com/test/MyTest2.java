package com.test;

import com.po.AutoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 86150
 * MyTest2
 * 2020/7/30 0:03
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class MyTest2 {
    @Autowired
    AutoService autoService;

    @Test
    public void test() {
        autoService.getName();
    }
}
