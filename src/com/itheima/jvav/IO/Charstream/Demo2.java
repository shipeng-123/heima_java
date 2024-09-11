package com.itheima.jvav.IO.Charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr =new FileReader("/Users/speng/jvav笔记/a.txt");
        char [] chars= new char[2];
        int len;
        while ((len=fr.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }

    }
}
