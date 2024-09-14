package com.itheima.jvav.IO.BufferedStream;

import java.io.*;
import java.util.*;

public class Demo5case2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/speng/前出师表.txt"));
        String line;
        TreeMap<Integer, String> tm = new TreeMap<>();
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            tm.put(Integer.parseInt(arr[0]), arr[1]);
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/speng/result.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bw.write(entry.getKey() + "." + value);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
