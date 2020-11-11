package com.abc.ba06;

/**
 * @author admin
 * @date 2020/11/4 12:07
 * version 1.0
 */
public class SomeServiceImpl implements ISomeService {

    public SomeServiceImpl() {
        System.out.println("===========");
    }

    public void doSome() {
        System.out.println("执行dosome方法");
    }

    public void afterInit(){
        System.out.println("当前对象初始化完毕");
    }

    public void beforeDestory(){
        System.out.println("当前对象马上就要被销毁了");
    }
}
