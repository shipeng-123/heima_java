package com.itheima.jvav.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class demo8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a-13", "b-12", "c-11", "d-10");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        long count = list.stream().count();
        System.out.println(count);
        String[] array = list.stream().toArray(String[]::new);
        Object[] array1 = list.stream().toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        String[] array2 = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(array2));
        String[] array3 = list.stream().toArray(value -> new String[value]);
    }
}
