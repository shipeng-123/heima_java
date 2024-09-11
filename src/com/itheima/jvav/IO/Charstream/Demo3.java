package com.itheima.jvav.IO.Charstream;

import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw= new FileWriter("/Users/speng/jvav笔记/a.txt");
        fw.write(25105);
        fw.close();
    }
}
