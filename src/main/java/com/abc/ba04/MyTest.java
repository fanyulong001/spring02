package com.abc.ba04;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author admin
 * @date 2020/11/4 12:10
 * version 1.0
 */
public class MyTest {

    /*使用工厂的模式实现了当前测试类与SomeService的解耦合
    *但是增加了两对耦合：当前测试类与工厂类耦合、工厂类与SomeServiceImpl耦合
     */


    @Test
    public void test01() {
        String cpmfig = "com/abc/ba04/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(cpmfig); //加载配置文件，创建容器对象
        ISomeService service = (ISomeService) ac.getBean("someService");
        ISomeService service02 = (ISomeService) ac.getBean("someService");
        System.out.println(service);
        System.out.println(service02);
    }
}