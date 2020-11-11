package com.abc.zdi04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author admin
 * @date 2020/11/10 9:38
 * version 1.0
 */
@Component()  //注意要加注解

@Scope("singleton")  //单例模式默认-------
@Scope("prototype")  //原型模式--------

public class School {
    @Value("安阳师院")
    private String sname;

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "School{" +
                "sname='" + sname + '\'' +
                '}';
    }
}
