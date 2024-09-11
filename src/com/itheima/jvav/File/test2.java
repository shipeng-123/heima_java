package com.itheima.jvav.File;

import java.io.File;

public class test2 {
    public static void main(String[] args) {
        File file = new File("/Users/speng/jvav笔记/");
        boolean b = haveMarkdown(file);
        System.out.println(b);

    }
    public static boolean haveMarkdown(File file){
        File [] files=file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()&&file1.getName().endsWith(".md")){
                return true;
            }
        }
        return false;
    }
}
