package com.itheima.jvav.immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class demo1 {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("11","212");
        hm.put("12","213");
        hm.put("13","214");
        hm.put("14","215");

        System.out.println(hm);
        Map<String, String> stringStringMap = Map.copyOf(hm);
        System.out.println(stringStringMap);
    }
}
