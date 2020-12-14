package com.gf.dspn.stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(-1, -2, 0, 4, 5);

        long count = numbers.parallelStream().filter(i -> i > 0).count();

        System.out.println("Positive count: " + count);
    }

}
