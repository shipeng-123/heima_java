package com.itheima.jvav.File;

import java.io.File;

public class Demo1 {
    public static void main(String[] args) {
        String str ="/Users/speng/a.txt";
        File f1= new File(str);
        System.out.println(f1);
        String Parent="/Users/speng";
        String Child = "a.txt";
        File file = new File(Parent, Child);
        System.out.println(f1);

    }
}
