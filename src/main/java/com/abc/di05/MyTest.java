package com.abc.di05;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author admin
 * @date 2020/11/4 12:10
 * version 1.0
 */
public class MyTest {
    //数组和集合注入
    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/abc/di05/applicationContext.xml");
        Some some = (Some) ac.getBean("some");
        System.out.println(some);
    }
}