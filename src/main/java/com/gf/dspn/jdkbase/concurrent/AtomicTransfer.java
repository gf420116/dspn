package com.gf.dspn.jdkbase.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *  测试安全类型对象的传递.
 *
 * @author doublej
 * @date 2022-03-06 13:28
 */
public class AtomicTransfer {

    public static void main(String[] args) {
        AtomicInteger orderErrorCount = new AtomicInteger(0);
        transferValue(orderErrorCount);
    }

    private static void transferValue(AtomicInteger param) {
        param.getAndAdd(1);
        System.out.println("param:" + param);
    }
}
