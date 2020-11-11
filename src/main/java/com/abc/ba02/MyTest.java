package com.abc.ba02;

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

    /*使用工厂的模式实现了当前测试类与SomeService的解耦合
    *但是增加了两对耦合：当前测试类与工厂类耦合、工厂类与SomeServiceImpl耦合
     */

    public void test01() {
        ServiceFactory factory = new ServiceFactory();
        ISomeService service = factory.getSomeService();
        service.doSome();
    }

    //降低了执行效率
    @Test
    public void test02() {
        String cpmfig = "com/abc/ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(cpmfig);
        ServiceFactory factory = (ServiceFactory) ac.getBean("factory");
        ISomeService service = factory.getSomeService();
        service.doSome();
    }

    @Test
    public void test03() {
        String cpmfig = "com/abc/ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(cpmfig);
        ISomeService service = (ISomeService) ac.getBean("someService");
        service.doSome();
    }
}