package com.itheima.jvav.Functiondemo;

import java.util.ArrayList;
import java.util.function.Function;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",12));
        list.add(new Student("张1",124));
        list.add(new Student("张12",122));
        list.add(new Student("张13",112));
        String[] array = list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        }).toArray(String[]::new);
        System.out.println(array.toString());
        list.stream().map(Student::getName).toArray(String[]::new);
    }
}
