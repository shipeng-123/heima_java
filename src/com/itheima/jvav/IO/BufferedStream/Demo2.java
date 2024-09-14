package com.itheima.jvav.IO.BufferedStream;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis =new BufferedInputStream(new FileInputStream("/Users/speng/jvav笔记/a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/speng/jvav笔记/copy.txt"));
        byte [] bytes = new byte [1024];
        int len ;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
    }
}
