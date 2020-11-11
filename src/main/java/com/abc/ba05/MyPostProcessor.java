package com.abc.ba05;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author admin
 * @date 2020/11/9 23:28
 * version 1.0
 */
public class MyPostProcessor implements BeanPostProcessor {
    //bean：当前正在创建的Bean对象
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("------before-----");
        return bean;
    }

    //bean：当前正在创建的Bean对象的ID属性
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("------after------");
        return bean;
    }
}
