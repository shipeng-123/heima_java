package com.itheima.jvav.File;

import java.io.File;
import java.util.HashMap;

public class test5 {
    public static void main(String[] args) {
        File f1 = new File("/Users/speng/jvav笔记/");
        HashMap<String, Integer> count = getCount(f1);
        System.out.println(count.toString());
    }
    public static HashMap<String,Integer> getCount(File file){
        HashMap<String,Integer>  hm = new HashMap<>();
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()) {
                String name = file1.getName();
                String[] split = name.split("\\.");
                if (split.length >= 2) {
                    String Filename = split[split.length - 1];
                    if (hm.containsKey(Filename)) {
                        Integer integer = hm.get(Filename);
                        hm.put(Filename, integer + 1);
                    } else {
                        hm.put(Filename, 1);
                    }
                }
            }else {
                HashMap<String, Integer> sonMap = getCount(file1);
                sonMap.entrySet().forEach(entry->{
                    if(hm.containsKey(entry.getKey())){
                        Integer integer = hm.get(entry.getKey());
                        hm.put(entry.getKey(),integer+entry.getValue());
                    }else {
                        hm.put(entry.getKey(),entry.getValue());
                    }
                });
            }
        }
        return hm;
    }
}
