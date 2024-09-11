package com.itheima.jvav.File;

import java.io.File;

public class Demo5 {
    public static void main(String[] args) {
        File file = new File("/Users/speng/jvav笔记/");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }

    }
}
