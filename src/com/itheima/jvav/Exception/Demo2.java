package com.itheima.jvav.Exception;

public class Demo2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int max = getMax(arr);

    }
    public static int getMax(int [] arr){
        if(arr==null){
            throw  new NullPointerException();
        }
        if (arr.length==0){
            throw new IndexOutOfBoundsException();
        }
        int max= arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
