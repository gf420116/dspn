package com.gf.dspn;

import com.google.common.collect.Lists;
import java.util.List;

/**
 * 线程安全的集合.
 *
 * @author doublej
 * @date 2022-02-28 15:20
 */
public class ThreadSafeList {

    public static void main(String[] args) {
//        Set<String> orderNos = Sets.newHashSet();
//        List<String> betNos = Lists.newArrayList();
//        changeLstSize(orderNos, betNos);
//        System.out.println(orderNos);
//        System.out.println(betNos);

        // NullPointerException
        List<Integer> lstTest = Lists.newArrayList(1, 2, 3,4,5,6,7,8,9,10);
        //List<Integer> lstTest = new CopyOnWriteArrayList<>(lstTest1);
        lstTest.stream().forEach(obj -> {
            System.out.println("lstTest.size():" + lstTest.size());
            System.out.println("obj:" + obj);
//            if(obj == 1){
//                lstTest.remove(obj);
//            }
        });
        System.out.println(lstTest.size());

//        // ConcurrentModificationException
//        List<Integer> lstTest = Lists.newArrayList(1,2,3);
////        List<Integer> lstTest = new CopyOnWriteArrayList<>(lstTest);
//        for (Integer temp:lstTest) {
//            System.out.println(temp);
//            if(temp == 1){
//                lstTest.remove(temp);
//            }
//        }
//        System.out.println(lstTest.size());
//    }

//    private static void changeLstSize(Set<String> orderNos, List<String> betNos){
//        Set<String> orderNosTemp = Sets.newHashSet("1");
//        List<String> betNosTemp = Lists.newArrayList("1");
//        orderNos.addAll(orderNosTemp);
//        betNos.addAll(betNosTemp);
//    }
    }

}
