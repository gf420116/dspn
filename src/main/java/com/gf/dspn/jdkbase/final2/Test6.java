package com.gf.dspn.jdkbase.final2;

/**
 * .
 *
 * @author : doublej
 * @Date : 2021-12-13 15:45
 */

public class Test6 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        StringBuffer buffer = new StringBuffer("hello");
        myClass.changeValue(buffer);
        System.out.println(buffer.toString());
    }
}

class MyClass {

    void changeValue(final StringBuffer buffer) {
        buffer.append("world");
    }
}
