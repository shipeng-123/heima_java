package com.itheima.jvav.stream.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三，35", "李四，12", "王五，44", "赵六，10");
        Map<String, String> collect = list.stream().filter(s -> Integer.parseInt(s.split("，")[1]) >= 24).collect(Collectors.toMap(s -> s.split("，")[0], s -> s.split("，")[1]));
        collect.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
