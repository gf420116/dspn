package com.gf.dspn.jdkbase.shallowcopy;

/**
 * .
 *
 * @author : doublej
 * @Date : 2021-12-13 14:14
 */

public class Address implements Cloneable {
    private final String name;

    // 省略构造函数、Getter&Setter方法


    public Address(String name) {
        this.name = name;
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}



