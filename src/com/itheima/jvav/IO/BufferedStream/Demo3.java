package com.itheima.jvav.IO.BufferedStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader( new FileReader("/Users/speng/jvav笔记/a.txt"));
//        String line1 = br.readLine();
//        System.out.println(line1);
//        String line2 = br.readLine();
//        System.out.println(line2);
        String line ;
         while ((line = br.readLine())!=null){
             System.out.println(line);
         }
         br.close();
    }
}
