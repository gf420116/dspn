package com.gf.dspn.jdkbase.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * AtomicInteger是java.util.concurrent.atomic 包下的一个原子类，该包下还有AtomicBoolean, AtomicLong,AtomicLongArray,
 * AtomicReference等原子类，主要用于在高并发环境下，保证线程安全。
 *
 * 1. 使用场景
 * 我们都知道，a++ 这个操作在多线程并发执行的情况下，是非线程安全的。并且由于a++过程包含三个步骤，即非原子性，
 * 所以即使使用volatile也不能保证线程安全；而加锁（如Synchronized）又十分影响性能，因此这个时候非常适用使用AtomicInteger来实现变量的自增。
 *
 * @author : doublej
 * @Date : 2021-12-15 20:40
 */

public class AtomicTest {

    public static void main(String[] args) {
        AtomicInteger temp = new AtomicInteger(100);
//        System.out.println(temp);

          // 获取当前的值
//        System.out.println(temp.get());

          // 获取当前的值，并设置新的值 100 105
//        System.out.println(temp.getAndSet(105));
//        System.out.println(temp);

          // 获取当前的值，并自增 100 101
//        System.out.println(temp.getAndIncrement());
//        System.out.println(temp);

          // 获取当前的值，并自减 100 99
//        System.out.println(temp.getAndDecrement());
//        System.out.println(temp);

          // 获取当前的值，并加上预期的值 100 101
//        System.out.println(temp.getAndAdd(1));
//        System.out.println(temp);

          // 以原子方式将当前值增加1，并在增加之后返回新值。 它等效于++i操作 101 101
//        System.out.println(temp.incrementAndGet());
//        System.out.println(temp);

          // 以原子方式将当前值减1，并在减后返回新值。 它等效于–-i操作。99 99
        System.out.println(temp.decrementAndGet());
        System.out.println(temp);

    }
}
