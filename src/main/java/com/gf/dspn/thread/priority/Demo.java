package com.gf.dspn.thread.priority;

/**
 * .
 *
 * @author : doublej
 * @Date : 2021-12-05 16:12
 */

public class Demo {
    public static void main(String[] args) {
        Thread a = new Thread();
        System.out.println("我是默认线程优先级：" + a.getPriority());
        Thread b = new Thread();
        b.setPriority(10);
        System.out.println("我是设置过的线程优先级：" + b.getPriority());
    }
}
