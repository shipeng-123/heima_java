package com.itheima.jvav.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/speng/jvav笔记/a.txt",true);
        String str= "石盆";
        byte[] bytes = str.getBytes();
        fos.write(bytes);
        String wrap= "\n";
        fos.write(wrap.getBytes());
        String str2="666nb";
        fos.write(str2.getBytes());

        fos.close();
    }
}
