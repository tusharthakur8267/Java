package com.company.Array;

public class sorted_or_not {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,3};
        int a=0,b=1;
        for (int i=1; i<=arr.length-1; i++){
            if (arr[i-1]>arr[i]){
                a++;
            }
            else
               b++;
        }
        if (b==arr.length){
            System.out.println("Sorted");
        }
        else
            System.out.println("not sorted");

    }
}
