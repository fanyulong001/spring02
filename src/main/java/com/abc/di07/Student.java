package com.abc.di07;

/**
 * @author admin
 * @date 2020/11/10 8:37
 * version 1.0
 */
public class Student {
    private String name; //成员变量
    private  int age;

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
                '}';
    }
}
