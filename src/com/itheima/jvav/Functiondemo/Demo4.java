package com.itheima.jvav.Functiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 2. 添加数据
        Collections.addAll(list, "张无忌-18", "周芷若-23", "赵敏-19", "张强-20", "张三丰-21");
        List<Student> collect = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                return new Student(s.split("-")[0], Integer.parseInt(s.split("-")[1]));
            }
        }).collect(Collectors.toList());
        for (Student student : collect) {
            System.out.println(student.toString());
        }
        list.stream().map(Student::new);

    }
}
