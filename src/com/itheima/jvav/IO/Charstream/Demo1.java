package com.itheima.jvav.IO.Charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr =new FileReader("/Users/speng/jvav笔记/a.txt");
        int ch;
        while ((ch=fr.read())!=-1){
            System.out.print((char) ch);
        }
        fr.close();
    }
}
