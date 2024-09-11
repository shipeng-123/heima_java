package com.itheima.jvav.File;

import java.io.File;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/speng/jvav笔记/c.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);

    }
}
