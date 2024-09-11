package com.itheima.jvav.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/speng/jvav笔记/a.txt");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }
        fis.close();
    }
}
