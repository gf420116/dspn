package com.gf.dspn.jdkbase.versioneight.stream;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

/**
 * .
 *
 * @author : doublej
 * @Date : 2021-12-17 15:42
 */

public class MapStream {

    public static void main(String[] args) {
        List<Human> listHuman = Lists.newArrayList();
        for (int i = 0; i < 5; i++) {
            Human human = new Human("account" + i, "name" + i, i);
            listHuman.add(human);
        }

        listHuman.stream().map(vo->{
            return vo;
        }).collect(Collectors.toList());
    }
}
