package com.abc.ba01;

/**
 * @author admin
 * @date 2020/11/4 12:07
 * version 1.0
 */
public class SomeServiceImpl implements ISomeService {
    public SomeServiceImpl() {
        System.out.println("执行无参的构造器");
    }

    public void doSome() {
        System.out.println("执行dosome方法");
    }
}
