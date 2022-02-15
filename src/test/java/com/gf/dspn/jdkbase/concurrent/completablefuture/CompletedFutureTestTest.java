package com.gf.dspn.jdkbase.concurrent.completablefuture;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import org.junit.Test;

public class CompletedFutureTestTest {

//    @Test
//    public void completedFutureExample() {
//        CompletableFuture cf = CompletableFuture.completedFuture("message");
//        assertTrue(cf.isDone());
//        assertEquals("message", cf.getNow(null));
//
//        System.out.println(cf.isDone());
//        System.out.println(cf.getNow(null));
//    }

    @Test
    public void testMapUstream() {
//        Map<String, List<String>> taskMap = Maps.newHashMap();
//        for (int i = 0; i < 5; i++) {
//            List<String> lstTemp = Lists.newArrayList();
//            lstTemp.add(String.valueOf(UUID.randomUUID()).replaceAll("-", ""));
//            //i++;
//            System.out.println(i);
//            taskMap.put("任务" + i, lstTemp);
//        }

        /*taskMap.forEach((key,value)->{
            System.out.println(key);
            System.out.println(value);
        });


        List<String> lstTempOutSide = taskMap.entrySet().stream().map(task-> task.getKey()).collect(Collectors.toList());
        lstTempOutSide.forEach(obj->{
            System.out.println(obj);
        });*/

//        Set<Map.Entry<String, List<String>>> tempSet = taskMap.entrySet();
//        for (Map.Entry<String, List<String>> entry:tempSet) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue().size());
//        }
//
//        Set<Object> set = Sets.newHashSet();

//        List lst = Lists.newArrayList();
//        lst = null;
//
//        System.out.println(lst == null);
//
//        lst.stream().forEach(value->{
//            System.out.println(value);
//        });

//        List lst = Lists.newArrayList(1);
//        closeObj(lst);
//        System.out.println(lst == null);
//        System.out.println(lst.size());

//        closeObj2(lst);
//        System.out.println(lst == null);
//        System.out.println(lst.size());

    }

    private void closeObj(Object... objs){
        if (objs != null) {
            for (Object obj : objs) {
                if (obj != null) {
                    obj = null;
                }
            }
        }
    }

    private void closeObj2(List lst){
        if (lst != null) {
            lst = null;
        }
    }

}