package com.itheima.jvav.Functiondemo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");
        ArrayList<Integer> list1 = new ArrayList<>();
        for (String s : list) {
            list1.add(Integer.parseInt(s));
        } 
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {

                return Integer.parseInt(s);
            }
        }).forEach(System.out::println);
        list.stream().map(Integer::parseInt).forEach(System.out::println);
        JButton go= new JButton();
    }

}
