package com.itheima.jvav.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class demo9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a-男-13", "b-男-12", "c-男-11", "d-男-10", "l-女-13");
        List<String> collect = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        collect.forEach(System.out::println);
        Set<String> set1 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        Map<String, Integer> collect1 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt( s.split("-")[2]);
                    }
                }));

    }
}

