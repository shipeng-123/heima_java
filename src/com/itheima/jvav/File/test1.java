package com.itheima.jvav.File;

import java.io.File;
import java.io.IOException;

public class test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/speng/jvav笔记/");
        file.mkdirs();
        File src = new File(file, "a.txt");
        boolean b = src.createNewFile();
        if (b) {
            System.out.println("创建成功");
        } else {
            System.out.println("创建失败");
        }

    }

}
