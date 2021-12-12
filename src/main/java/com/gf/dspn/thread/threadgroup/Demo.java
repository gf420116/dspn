package com.gf.dspn.thread.threadgroup;

/**
 * .
 *
 * @author : doublej
 * @Date : 2021-12-05 16:01
 */

public class Demo {
    public static void main(String[] args) {
        Thread testThread = new Thread(() -> {
            System.out.println("testThread当前线程组名字：" +
                Thread.currentThread().getThreadGroup().getName());
            System.out.println("testThread线程名字：" +
                Thread.currentThread().getName());
        });
        testThread.start();
        System.out.println("执行main方法线程名字：" + Thread.currentThread().getName());
    }
}
