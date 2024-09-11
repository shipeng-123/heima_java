package com.itheima.jvav.IO;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo6 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str= "a开";
        byte [] bytes1=str.getBytes();
        System.out.println(Arrays.toString(bytes1));
        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));
        String s = new String(bytes1);
        String s1 = new String(bytes2,"GBK");
        System.out.println(s);
        System.out.println(s1);
    }
}
