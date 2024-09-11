package com.itheima.jvav.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        Collections.addAll(list,"ad","a","d");
        Stream <String> stream = list.stream();
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
