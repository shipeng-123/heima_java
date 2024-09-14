package com.itheima.jvav.IO.BufferedStream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo5case1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/speng/前出师表.txt"));
        String line;
        ArrayList <String >  list  = new ArrayList<>();
        while ((line= br.readLine())!=null){
            list.add(line);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n1 =Integer.parseInt( o1.split("\\.")[0]);
                int n2 =Integer.parseInt( o2.split("\\.")[0]);
                return n1-n2;
            }
        });
        BufferedWriter  bw= new BufferedWriter(new FileWriter("/Users/speng/result.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
