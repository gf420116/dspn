package com.gf.dspn.jdkbase.thread.diffrent;

/**
 * .
 *
 * @author : doublej
 * @Date : 2021-12-27 15:07
 */

//program--Thread
public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        new MyThread().start();
        new MyThread().start();

    }


    static class MyThread extends Thread {
        private int ticket = 5;

        public void run() {
            while (true) {
                System.out.println("Thread ticket = " + ticket--);
                if (ticket < 0) {
                    break;
                }
            }
        }
    }
}

