package com.gf.dspn.jdkbase.thread.synchronize;

/**
 * 修饰实例方法.
 *
 * @author : doublej
 * @Date : 2021-12-27 14:15
 */

public class InstanceCallable1 implements Runnable {

    private Integer num = 0;

    @Override
    public void run() {
        instanceLock();
    }

    // 关键字在实例方法上，锁为当前实例
    public void instanceLock() {
        // code
        for (int i = 1; i <= 100000; i++) {
            num++;
            System.out.println(Thread.currentThread().getName() + ",num=" + this.num);
        }
    }
    // 关键字在静态方法上，锁为当前Class对象
    public static synchronized void classLock() {
        // code
    }
    // 关键字在代码块上，锁为括号里面的对象
    public void blockLock() {
        Object o = new Object();
        synchronized (o) {
            // code
        }
    }

    public static void main(String[] args) {
        InstanceCallable1 test = new InstanceCallable1();
        new Thread(test,"test1").start();
        new Thread(test,"test2").start();
    }
}



