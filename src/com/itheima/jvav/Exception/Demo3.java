package com.itheima.jvav.Exception;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GirlFriend gf = new GirlFriend();
        while (true) {
            try {
                System.out.println("名字");
                String name = sc.nextLine();
                gf.setName(name);
                System.out.println("年龄");
                int age = Integer.parseInt(sc.nextLine());
                gf.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入年龄格式有误");
            }catch (RuntimeException e) {
                System.out.println("姓名长度或者年龄范围有误");
            }
        }
    }
}
