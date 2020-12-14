package com.gf.dspn.stream;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {

    public static <map> void main(String[] args) {

        List<Integer> numbers = Arrays.asList(-1, -2, 0, 4, 5);

        //1 forEach()
        /*numbers.stream().forEach(n -> System.out.println("List element: " + n));*/

        //2 map()
        /*numbers.stream().map(n -> Math.abs(n)).forEach(n -> System.out.println("Element abs: " + n));*/

        //3 flatMap()
        List<String> list = Arrays.asList("1 2", "3 4", "5 6");
        /*list.stream().flatMap(item -> Arrays.stream(item.split(" "))).forEach(System.out::println);*/

        //map()
        /*list.stream().map(item -> Arrays.stream(item.split(" "))).forEach(n -> n.forEach(System.out::println));*/

        //4 reduce()
        /*numbers = new ArrayList(numbers);
        numbers.clear();
        System.out.println(numbers.size());
        numbers = Arrays.asList(-1, -2, 0, -1, 4, 5, 1);

        Integer total = numbers.stream().reduce((t, n) -> t + n).get();
        System.out.println("Total: " + total);*/

        //5 collect() Collectors.toList()、Collectors.toSet()、Collectors.joining()
        /*List<Integer> abss = numbers.stream().map(n -> Math.abs(n)).collect(Collectors.toList());
        System.out.println("Abs list: " + abss);*/

        //6 summaryStatistics()
        /*IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Max : " + stats.getMax());
        System.out.println("Min : " + stats.getMin());
        System.out.println("Sum : " + stats.getSum());
        System.out.println("Average : " + stats.getAverage());
        System.out.println("Count : " + stats.getCount());*/

        List<SmsCustomerSendDetail> details = new ArrayList<>();
        SmsCustomerSendDetail temp1 = new SmsCustomerSendDetail();
        temp1.setId(1);
        temp1.setCustomerId("11");
        temp1.setSmsFee(111);
        SmsCustomerSendDetail temp2 = new SmsCustomerSendDetail();
        temp2.setId(2);
        temp2.setCustomerId("22");
        temp2.setSmsFee(222);
        details.add(temp1);
        details.add(temp2);
        //7 分组
        Map<String,List<SmsCustomerSendDetail>> collect = details.stream().collect(Collectors.groupingBy(SmsCustomerSendDetail::getCustomerId));
        for (Map.Entry<String, List<SmsCustomerSendDetail>> entry : collect.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //8 单列求和
        int totalValue = details.stream().mapToInt(SmsCustomerSendDetail::getSmsFee).sum();
        System.out.println(totalValue);

        //9 提取单列数据集合
        List<Integer> ids = details.stream().map(SmsCustomerSendDetail::getId).collect(Collectors.toList());
        System.out.println(ids.size());
    }

}
