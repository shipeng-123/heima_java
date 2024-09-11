package com.itheima.jvav.Functiondemo;

import java.util.ArrayList;
import java.util.function.Function;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<String> x =new ArrayList<>();
        x.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });
        x.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
