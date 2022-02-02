package com.gf.dspn.jdkbase.thread.diffrent;

/**
 * .
 *
 * @author : doublej
 * @Date : 2021-12-27 15:08
 */

//program--Runnable
public class Test2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyThread2 mt = new MyThread2();
        new Thread(mt).start();
        new Thread(mt).start();


    }

    static class MyThread2 implements Runnable {
        private int ticket = 5;

        public void run() {
            while (true) {
                System.out.println("Runnable ticket = " + ticket--);
                if (ticket < 0) {
                    break;
                }
            }
        }
    }
}

