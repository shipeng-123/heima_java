package com.itheima.jvav.IO.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream src = new FileInputStream("/Users/speng/ency.png");
        /* 创建要拷贝的目的地*/
        FileOutputStream dest = new FileOutputStream("/Users/speng/redu.png");
        int b;
        while ((b=src.read())!=-1){
            dest.write(b^2);
        }
        src.close();
        dest.close();
    }
}
