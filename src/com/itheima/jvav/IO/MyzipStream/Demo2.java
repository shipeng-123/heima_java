package com.itheima.jvav.IO.MyzipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        File src = new File("/Users/speng/jvav笔记/a.txt");
        File dest= new File("/Users/speng/");
        toZip(src,dest);
    }
    public static void toZip(File src ,File dest) throws IOException {
        ZipOutputStream stream = new ZipOutputStream( new FileOutputStream(new File(dest,"a.zip")));
        ZipEntry entry= new ZipEntry("a.txt");
        stream.putNextEntry(entry);
        FileInputStream fis= new FileInputStream(src);
        int b;
        while ((b=fis.read())!=-1){
            stream.write(b);
        }
        stream.closeEntry();
        stream.close();
    }
}
