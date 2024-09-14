
package com.itheima.jvav.IO.convertStream;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter ow= new OutputStreamWriter(new FileOutputStream("src/com/itheima/jvav/IO/convertStream/b.txt"),"GBK");
        ow.write("你好");
        ow.close();
    }
}
