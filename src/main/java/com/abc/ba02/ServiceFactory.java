package com.abc.ba02;

/**
 * @author admin
 * @date 2020/11/8 18:27
 * version 1.0
 */
public class ServiceFactory {
    public ISomeService getSomeService(){
        return new SomeServiceImpl();
    }
}
