package com.itheima.jvav.IO.BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/speng/jvav笔记/test.txt",true));
        bw.write("臭骚b");
        bw.newLine();
        bw.close();
    }
}
