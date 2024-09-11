package com.itheima.jvav.File;

import java.io.File;

public class Demo3 {
    public static void main(String[] args) {
        File f1 =new File("/Users/speng/SpAng/a.txt");
        long length = f1.length();
        System.out.println(length);
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);
        String path = f1.getPath();
        System.out.println(path);

    }
}
    