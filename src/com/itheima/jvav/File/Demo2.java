package com.itheima.jvav.File;

import java.io.File;

public class Demo2 {
    public static void main(String[] args) {
        File f1 =new File("/Users/speng/SpAng");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        File file = new File("/Users/speng/复习题");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
    }
}
