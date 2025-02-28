package com.Java_Exercise;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        int [] arr1 =new int[6];
        int j=5;
        for (int i=0; i<6; i++){
           arr1[i]= arr[j];
           j--;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
