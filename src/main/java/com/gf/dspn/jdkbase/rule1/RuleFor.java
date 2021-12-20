package com.gf.dspn.jdkbase.rule1;

import java.util.ArrayList;
import java.util.List;

/**
 * .
 *
 * @author : doublej
 * @Date : 2021-12-17 11:22
 */

public class RuleFor {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
