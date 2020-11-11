package com.abc.zdi03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author admin
 * @date 2020/11/10 8:37
 * version 1.0
 */
@Component  //表示当前类的对象由Spring容器管理
public class Student {
    @Value("张三")
    private String name; //成员变量
    @Value("20")
    private  int age;

    //@Autowired  //byType域属性自动注入------------------
    //private School school; //对象属性，域属性

//    @Autowired
//    @Qualifier("mySchool")  //byName域属性自动注入，要求@Autowired和@Qualifier同时使用---------
//    private School school;  //对象属性，域属性

//    @Resource   //byType域属性自动注入------------------
//    private School school;  //对象属性，域属性

//    @Resource()
    private School school;  //对象属性，域属性

    public void setSchool(School school) {
        this.school = school;
    }


    public void setName(String name) { //属性：name
        this.name = name;
    }

    public void setAge(int age) { //属性：age
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
