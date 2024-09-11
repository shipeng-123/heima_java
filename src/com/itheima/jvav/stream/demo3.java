package com.itheima.jvav.stream;

import java.util.HashMap;

public class demo3 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("adsd",111);
        hm.put("ad2sd",111);
        hm.put("a3d",111);
        hm.put("ad4d",111);
        hm.put("adsd",111);
        hm.entrySet().stream().forEach(s-> System.out.println(s.getKey()));
    }
}
