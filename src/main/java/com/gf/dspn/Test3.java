package com.gf.dspn;

import com.google.common.collect.Lists;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * CompletableFuture执行顺序.
 *
 * @author doublej
 * @date 2022-02-15 13:18
 */
public class Test3 {
    public static void main(String[] args) {
        //System.out.println(new Random().ints(99, 300).findFirst());
        List lst = Lists.newArrayList();
        lst.add(1);
        lst.add(2);
        lst.add(3);

        Map<Integer,String> map = new HashMap<>(lst.size());

        System.out.println(lst.size());
        System.out.println(map.size());
    }
}
