package com.abc.ba03;

/**
 * @author admin
 * @date 2020/11/8 18:27
 * version 1.0
 */
public class ServiceFactory {
    public static ISomeService getSomeService(){
        return new SomeServiceImpl();
    }
}
