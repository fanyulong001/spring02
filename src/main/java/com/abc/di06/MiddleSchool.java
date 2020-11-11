package com.abc.di06;

/**
 * @author admin
 * @date 2020/11/10 18:44
 * version 1.0
 */
public class MiddleSchool extends School {
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MiddleSchool{" +
                "address='" + address + '\'' +
                '}';
    }
}
