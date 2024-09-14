package com.itheima.jvav.IO.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class test3 {
    public static void main(String[] args) throws IOException {
      /*FileWriter fw = new FileWriter("/Users/speng/b.txt");
        Random random = new Random();
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(random.nextInt(100));
            if(i!=9){
                sb.append("-");
            }
        }
        fw.write(sb.toString());
        fw.close();*/

        FileReader file = new FileReader("/Users/speng/b.txt");
        FileWriter fw= new FileWriter("/Users/speng/a.txt");
        int ch ;
        StringBuilder sb = new StringBuilder();
        while ((ch= file.read())!=-1){
            sb.append((char)ch);
        }
        String str= sb.toString();
        String[] split = str.split("-");
        Integer[] array1 = Arrays.stream(split).map(Integer::parseInt).toArray(Integer[]::new);
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            fw.write(array1[i]+"");
            if(i!=array1.length-1){
                fw.write("-");
            }
        }

        fw.close();
        file.close();
    }
}
