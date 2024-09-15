package com.itheima.jvav.IO.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class test4case2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("/Users/speng/result.txt"));
        /*Object o1 = OIS.readObject();
        Object o2 = OIS.readObject();
        Object o3 = OIS.readObject();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        OIS.close();*/
        ArrayList<Student> list = (ArrayList<Student>) OIS.readObject();
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
