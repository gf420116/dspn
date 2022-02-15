package com.gf.dspn;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * .
 *
 * @author doublej
 * @date 2022-02-14 19:34
 */
public class Test2 {
    public static void main(String[] args) {
        List<Person> lst = Lists.newArrayList();
//        for (int i = 0; i < 2; i++) {
        Person person1 = new Person("jack", "malate");
        Person person2 = new Person("jack", "pasay");
        lst.add(person1);
        lst.add(person2);
//        }

        // (s, a) -> s + ", " + a   jack->malate, pasay
        Map<String, String>
            phoneBooks = lst.stream().collect(
            Collectors.toMap(Person::getName, Person::getAddress, (s, a) -> a));

        for (Map.Entry<String, String> entry : phoneBooks.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}

@AllArgsConstructor
@Data
class Person{
    private String name;
    private String address;
}