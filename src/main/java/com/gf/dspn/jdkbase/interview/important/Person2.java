package com.gf.dspn.jdkbase.interview.important;

import java.util.List;

/**
 * Java 中将实参传递给方法（或函数）的方式是 值传递 ：
 * 如果参数是基本类型的话，很简单，传递的就是基本类型的字面量值的拷贝，会创建副本。 实参不会改变
 * 如果参数是引用类型，传递的就是实参所引用的对象在堆中地址值的拷贝，同样也会创建副本。 实参会改变
 *
 * @author doublej
 * @date 2022-02-08 9:17
 */
public class Person2 {

    private String name;

    public Person2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person2 xiaoZhang = new Person2("小张");
        change(xiaoZhang);
        System.out.println(xiaoZhang.getName());

//        closeObj2(xiaoZhang);
//        xiaoZhang = null;
//        System.out.println(xiaoZhang == null);

//        Integer n = 3;
//        Integer m = 1;
//        System.out.println(n + m);

    }

    public static void change(Person2 person) {
        person.setName("小张儿子");
    }

//    private static void closeObj2(Person2 xiaoZhang){
//        if (xiaoZhang != null) {
//            xiaoZhang = null;
//        }
//    }
}
