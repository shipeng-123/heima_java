package com.itheima.jvav.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class demo6 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"a","a","a","a","a");
        list1.stream().distinct().forEach(s -> System.out.println(s));
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"b","b","c");
        Stream.concat(list1.stream(),list2.stream()).forEach(s -> System.out.println(s));

    }
}
