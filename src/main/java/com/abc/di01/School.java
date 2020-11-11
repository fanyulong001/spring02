package com.abc.di01;

/**
 * @author admin
 * @date 2020/11/10 9:38
 * version 1.0
 */
public class School {
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
