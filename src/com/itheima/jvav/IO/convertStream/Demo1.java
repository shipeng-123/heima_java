package com.itheima.jvav.IO.convertStream;


import java.io.*;
import java.nio.charset.Charset;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //字符转换流
        InputStreamReader isr = new InputStreamReader(new FileInputStream("/Users/speng/IdeaProjects/heimajava/src/com/itheima/jvav/IO/convertStream/result.txt"),"GB18030");
        int len ;
        while ((len=isr.read())!=-1){
            System.out.print((char) len);
        }
        isr.close();
        FileReader fr = new FileReader("/Users/speng/IdeaProjects/heimajava/src/com/itheima/jvav/IO/convertStream/result.txt", Charset.forName("GB18030"));
        int len1;
        while ((len1=fr.read())!=-1){
            System.out.print((char) len1);
        }
    }
}
