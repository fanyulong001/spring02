package com.abc.zdi03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author admin
 * @date 2020/11/10 9:38
 * version 1.0
 */
@Component()  //注意要加注解
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
