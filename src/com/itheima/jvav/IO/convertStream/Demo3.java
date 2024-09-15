package com.itheima.jvav.IO.convertStream;

import java.io.*;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader( new FileInputStream("/Users/speng/IdeaProjects/heimajava/src/com/itheima/jvav/IO/convertStream/result.txt"),"GB18030"));
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();

    }
}
