package com.itheima.jvav.IO.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class test4 {
    public static void main(String[] args) throws IOException {
        Student s1= new Student("zhangsan",23,"南京");
        Student s2= new Student("zhangsan1",23,"北京");
        Student s3= new Student("zhangsan2",23,"京");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/speng/result.txt"));
/*        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);*/
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        oos.writeObject(students);
        oos.close();

    }
}
