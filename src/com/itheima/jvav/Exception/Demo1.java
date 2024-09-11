package com.itheima.jvav.Exception;

public class Demo1 {
    public static void main(String[] args) {
        int [ ] arr= {1,2,3,4,5,6};
        try{
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            String message = e.getMessage();
            System.out.println(message);

        }
        System.out.println("sad");
    }
}
