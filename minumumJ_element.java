package com.company.Array;
public class minumumJ_element {
    public static void main(String[] args) {
        int [] arr= {12,343,545,454,343,1};
        int min=arr[0];
        for (int i=0;i<=arr.length-1; i++){
            if (arr[i]<=min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
