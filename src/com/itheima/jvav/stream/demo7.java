package com.itheima.jvav.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class demo7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a-13", "b-12", "c-11", "d-10");
//        list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                String[] split = s.split("-");
//                String ageString = split[1];
//                int age = Integer.parseInt(ageString);
//                return age;
//            }
//        }).forEach(s -> System.out.println(s));
        Stream<Integer> integerStream = list.stream().map(s -> Integer.parseInt(s.split("-")[1]));
        integerStream.forEach(s-> System.out.println(s));

    }
}
