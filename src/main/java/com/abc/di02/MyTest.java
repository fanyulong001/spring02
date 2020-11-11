package com.abc.di02;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author admin
 * @date 2020/11/10 8:41
 * version 1.0
 */
public class MyTest {
    //构造器注入
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/abc/di02/applicationContext.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }
}
