package com.gf.dspn.jdkbase.interview.final2;

/**
 * .
 *
 * @author : doublej
 * @Date : 2021-12-13 15:22
 */

public class Test {
    public static void main(String[] args) {
        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println((a == c));
        System.out.println((a == e));
        System.out.println(a.equals(e));
    }
}
