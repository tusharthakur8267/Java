package com.Java_Exercise;

public class Missing_element_Array {
    public static void main(String[] args) {
        int[]arr = new int[100];
        for (int i=0; i<100; i++){
            if (i!=50){
            arr[i]=i;
            }

        }
        System.out.println(arr[50]);
        int sum=0;
        int sum1;
        for (int i=0; i<100; i++){
            sum += arr[i];
        }
        sum1 =99*(99+1)/2;
        System.out.println(sum+" "+sum1);
        System.out.println("Missing elements is "+(sum1-sum));
    }
}
