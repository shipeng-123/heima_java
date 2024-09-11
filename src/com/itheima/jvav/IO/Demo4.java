package com.itheima.jvav.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("/Users/speng/jvav笔记/a.txt");
        int read = fis.read();
        System.out.println((char) read);
    }
}
