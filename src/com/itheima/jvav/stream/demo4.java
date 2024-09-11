package com.itheima.jvav.stream;

import java.util.Arrays;

public class demo4 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,5,9};
        Arrays.stream(arr).forEach(System.out::println);
    }
}
