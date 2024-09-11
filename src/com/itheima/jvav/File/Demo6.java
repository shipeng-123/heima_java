package com.itheima.jvav.File;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Demo6 {
    public static void main(String[] args) {
        File[] files = File.listRoots();
        String string = Arrays.toString(files);
        System.out.println(string);
        File file = new File("/Users/speng/jvav笔记/");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        File f2 = new File("/Users/speng/jvav笔记/");
        String[] list1 = f2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file1 = new File(dir, name);
                if (file1.isFile()&&name.endsWith(".md")){
                    return true;
                }
                return  false;
            }
        });
        System.out.println(Arrays.toString(list1));
        File f3=  new File("/Users/speng/jvav笔记/");
        f3.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile()&&pathname.getName().endsWith(".md");
            }
        });

    }
}
