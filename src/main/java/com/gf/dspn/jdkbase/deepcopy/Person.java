package com.gf.dspn.jdkbase.deepcopy;

/**
 * 深拷贝 ：深拷贝会完全复制整个对象，包括这个对象所包含的内部对象.
 *
 * @author : doublej
 * @Date : 2021-12-13 14:14
 */

public class Person implements Cloneable {
    private Address address;

    // 省略构造函数、Getter&Setter方法
    public Person(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Person clone() {
        try {
            Person person = (Person) super.clone();
            person.setAddress(person.getAddress().clone());
            return person;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person(new Address("武汉"));
        Person person1Copy = person1.clone();
        // false
        System.out.println(person1.getAddress() == person1Copy.getAddress());

    }
}
