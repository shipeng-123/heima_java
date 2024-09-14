package com.itheima.jvav.IO.BufferedStream;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis =new BufferedInputStream(new FileInputStream("/Users/speng/jvav笔记/a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/speng/jvav笔记/copy.txt"));
        int b;
        while ((b=bis.read())!=-1){
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
}
