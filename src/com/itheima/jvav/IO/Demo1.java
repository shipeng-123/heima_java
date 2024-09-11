package com.itheima.jvav.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/speng/jvav笔记/a.txt");
        fos.write(97);
        fos.close();
    }
}
