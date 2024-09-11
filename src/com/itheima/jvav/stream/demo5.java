package com.itheima.jvav.stream;

import java.util.stream.Stream;

public class demo5 {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
    }
}
