package com.itheima.jvav.stream;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list1= new ArrayList<>();
        list1.add("z");
        list1.add("k12");
        list1.add("k12");
        list1.add("k12");
        list1.add("k12");
        list1.stream().filter(name ->name.startsWith("k")).filter(name->name.length()==3).forEach(name-> System.out.println(name));
//        ArrayList<String> list2= new ArrayList<>();
//        for (String name : list1) {
//            if(name.startsWith("k")){
//                list2.add(name);
//            };
//        }
//        System.out.println(list2);
//        ArrayList<String> list3 = new ArrayList<>( );
//        for (String name : list3) {
//            if(name.length()==3){
//                list3.add(name);
//            }
//
//        }
//        System.out.println(list3);
    }
}
