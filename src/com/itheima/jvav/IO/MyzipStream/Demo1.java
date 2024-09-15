package com.itheima.jvav.IO.MyzipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("/Users/speng/jvav笔记.zip");
        File dest = new File("/Users/speng/");
        unzip(src, dest);
    }

    public static void unzip(File src, File dest) throws IOException {
        try (ZipInputStream zip = new ZipInputStream(new FileInputStream(src))) {
            ZipEntry nextEntry;
            while ((nextEntry = zip.getNextEntry()) != null) {
                // 构建解压的目标文件
                File outFile = new File(dest, nextEntry.getName());

                // 跳过 "__MACOSX" 和隐藏文件 "._" 开头的文件
                if (nextEntry.getName().startsWith("__MACOSX") || nextEntry.getName().contains("._")) {
                    zip.closeEntry();
                    continue;
                }

                if (nextEntry.isDirectory()) {
                    // 如果是目录，创建目录
                    outFile.mkdirs();
                } else {
                    // 如果是文件，确保父目录存在
                    File parentDir = outFile.getParentFile();
                    if (!parentDir.exists()) {
                        parentDir.mkdirs();
                    }

                    // 写入文件内容
                    try (FileOutputStream fos = new FileOutputStream(outFile)) {
                        byte[] buffer = new byte[1024];
                        int len;
                        while ((len = zip.read(buffer)) != -1) {
                            fos.write(buffer, 0, len);
                        }
                    }
                }
                zip.closeEntry();
            }
        }
    }
}