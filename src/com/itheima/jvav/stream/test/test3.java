package com.itheima.jvav.stream.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class test3 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        Collections.addAll(l1,
                "蔡坤坤,24", "叶帅威,23", "刘不甜,22",
                "吴签,24", "谷嘉,30", "肖梁梁,27"
        );

        // 添加女演员
        Collections.addAll(l2,
                "赵小颖,35", "杨颖,36", "高元元,43",
                "张天天,31", "刘诗,35", "杨小霏,33"
        );
        Stream<String> manl = l1.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);
        Stream<String> womanl = l2.stream().filter(s -> s.split(",")[0].startsWith("杨")).skip(1);
        Stream<Actor> actorStream = Stream.concat(manl, womanl).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Actor(name, age);
            }
        });
        actorStream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll).forEach(System.out::println);
    }
}
