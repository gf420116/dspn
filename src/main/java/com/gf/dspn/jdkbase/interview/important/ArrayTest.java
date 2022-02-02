package com.gf.dspn.jdkbase.interview.important;

/**
 * .
 *
 * @author : doublej
 * @Date : 2021-12-27 16:24
 */

public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] array) {
        // 将数组的第一个元素变为0
        array[0] = 0;
    }

}
