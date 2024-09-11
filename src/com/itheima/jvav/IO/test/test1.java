package com.itheima.jvav.IO.test;

import java.io.*;

public class test1 {
    public static void main(String[] args) throws IOException {
        /* 创建数据源*/
        File src = new File("/Users/speng/jvav笔记");
        /* 创建要拷贝的目的地*/
        File dest = new File("/Users/speng/javacopy");
        copydir(src, dest);
    }

    private static void copydir(File src, File dest) throws IOException {
        if (!dest.exists()) {
            dest.mkdirs();
        }
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
                fis.close();
                fos.close();
            } else {
                copydir(file, new File(dest, file.getName()));
            }
        }
    }
}
