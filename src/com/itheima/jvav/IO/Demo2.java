package com.itheima.jvav.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=  new FileOutputStream("/Users/speng/jvav笔记/a.txt");
//        fos.write(97);
//        fos.write(98);
        byte [] arr = {97,98,99,100,101};
//        fos.write(arr);
        fos.write(arr,0,3);
        fos.close();
    }
}
