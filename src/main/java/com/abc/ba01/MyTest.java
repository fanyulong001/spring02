package com.abc.ba01;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author admin
 * @date 2020/11/4 12:10
 * version 1.0
 */
public class MyTest {
    @Test

    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/abc/ba01/applicationContext.xml");
        ISomeService service = (ISomeService) ac.getBean("someService");
        service.doSome();
    }
}