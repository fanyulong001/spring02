package com.abc.di05;
import java.util.*;

/**
 * @author admin
 * @date 2020/11/10 18:05
 * version 1.0
 */
public class Some {
    private String[] names;
    private List<String> myLisy;
    private  List<School> schools;
    private Set<String> mySet;
    private Map<String,Object> myMap;
    private Properties myPros;

    public void setNames(String[] names) {
        this.names = names;
    }

    public void setMyLisy(List<String> myLisy) {
        this.myLisy = myLisy;
    }

    public void setSchools(List<School> schools) {
        this.schools = schools;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, Object> myMap) {
        this.myMap = myMap;
    }

    public void setMyPros(Properties myPros) {
        this.myPros = myPros;
    }

    @Override
    public String toString() {
        return "Some{" +
                "names=" + Arrays.toString(names) +
                ", myLisy=" + myLisy +
                ", schools=" + schools +
                ", mySet=" + mySet +
                ", myMap=" + myMap +
                ", myPros=" + myPros +
                '}';
    }
}
