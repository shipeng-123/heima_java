package com.itheima.jvav.File;

import java.io.File;

public class test3 {
    public static void main(String[] args) {
        File src = new File("/Users/speng/jvav笔记/");
        FindJpg(src);
    }

    public static void FindJpg(File src) {
        File[] fileList = src.listFiles();
        if(fileList==null){
            System.out.println(src);
        }
        for (File file : fileList) {
            if(file.isFile()){
                String name = file.getName();
                if(name.endsWith("jpg")){
                    System.out.println(file);
                }
            }else {
                FindJpg(file);
            }
        }
    }
}
