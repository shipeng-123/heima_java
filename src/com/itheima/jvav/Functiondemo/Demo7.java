package com.itheima.jvav.Functiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-18", "周芷若-23", "赵敏-19", "张强-20", "张三丰-21");
        list.stream().map(Student::new).toArray(Student[] ::new);

    }
}
