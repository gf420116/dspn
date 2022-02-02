package com.gf.dspn.jdkbase.versioneight.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        //1
        /*IntStream list = IntStream.range(0, 10);
        Set<Thread> threadSet = new CopyOnWriteArraySet<>();
        //开始并行执行
        list.parallel().forEach(i -> {
            Thread thread = Thread.currentThread();
            System.err.println("integer：" + i + "，" + "currentThread:" + thread.getName());
            threadSet.add(thread);
        });
        System.out.println("all threads：" + threadSet.stream().map(Thread::getName).collect(Collectors.joining(":")));*/

        //2
        /*// 获取当前机器CPU处理器的数量
        System.out.println(Runtime.getRuntime().availableProcessors());// 输出 4
        // parallelStream默认的并发线程数
        System.out.println(ForkJoinPool.getCommonPoolParallelism());// 输出 3*/

        //3 parallelStream是线程不安全的；
        /*List<Integer> values = new ArrayList<>();
        IntStream.range(1, 10000).parallel().forEach(values::add);
        System.out.println(values.size());*/

        //4 加锁｜使用线程安全的集合或者采用collect()或者reduceu操作就是满足线程安全的了
        /*List<Integer> values = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            values.add(i);
        }
        List<Integer> collect = values.stream().parallel().collect(Collectors.toList());
        System.out.println(collect.size());*/

        Stream<String> stream = Stream.of("How", "do", "you", "do");
        List<String> list = stream.collect(ArrayList::new, ArrayList::add, (t, u) -> {
            System.out.println("t:" + t + " u:" + u);
            t.addAll(u);
        });
        System.out.println(list);


    }

}
