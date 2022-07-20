package com.gf.dspn;

import lombok.extern.slf4j.Slf4j;

/**
 * .
 *
 * @author doublej
 * @date 2022-02-12 17:23
 */

@Slf4j
public class Test1 {

    public static void main(String[] args) {
        System.out.println("11111111111");
        int n = 100;
        int m = 0;
        try {
            int tempCalculate = n/m;
        } catch (Exception e) {
            // e.toString()不打印异常信息
            //log.error("请检查参数运算{},{}",n,m,e);
//            log.error("请检查参数运算{},{},{}",n,m,e);
//            System.out.println("----------------");
//            // java.lang.ArithmeticException: / by zero
//            System.out.println(e.toString());
//            log.error("请检查参数运算{},{},{}",n,m,e.toString());

            log.error("{},堆栈异常", "logPrefix", e);
        }
    }
}
