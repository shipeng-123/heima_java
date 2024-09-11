package com.itheima.jvav.File;

import java.io.File;

public class test4 {
    public static void main(String[] args) {
        File f1 = new File("/Users/speng/jvav笔记/");
        System.out.println(getLen(f1));

    }
    public static long getLen(File src){
        long len = 0;
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                len+=file.length();
            }else {
                len+=getLen(file);
            }
        }
        return len;
    }
}
