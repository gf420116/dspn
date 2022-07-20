package com.gf.dspn;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * .
 *
 * @author doublej
 * @date 2022-03-04 17:22
 */
public class Test5 {

    public static void main(String[] args) {
//        Stream<Integer> list = Stream.of(1,2,3,4,5);
//        Optional<Integer> result = list.reduce((x, y) -> x + y);
//        System.out.println(result.get());
        List<String> list = Lists.newArrayList("1","1","1");
        list.stream().forEach(value->{
            System.out.println(value);
        });

    }
}
