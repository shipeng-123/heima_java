package com.itheima.jvav.Functiondemo;

import java.util.ArrayList;

public class Demo9 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 12));
        list.add(new Student("张1", 124));
        list.add(new Student("张12", 122));
        list.add(new Student("张13", 112));
        for (String s : list.stream().map(Student::toString).toArray(String[]::new)) {
            System.out.println(s);
        }

    }
}
