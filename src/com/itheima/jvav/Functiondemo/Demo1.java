package com.itheima.jvav.Functiondemo;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        Integer [ ] arr = {1,2,3,5,6,7,8};
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));
        //lambda
        Arrays.sort(arr,(a1,a2)-> a2-a1);*/
        Arrays.sort(arr,Demo1::subtraction);
    }
    public static int subtraction(int n1,int n2){
        return n2-n1;
    }
}
