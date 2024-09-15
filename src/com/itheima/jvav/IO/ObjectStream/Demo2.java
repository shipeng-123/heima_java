package com.itheima.jvav.IO.ObjectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/speng/result.txt"));
        Student o =(Student) ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
