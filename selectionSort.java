package com.DSA;

import java.util.Arrays;

public class selectionSort {

    static void swapElements(int[] Array, int i, int j){
        if (i==j){
            return;
        }
        int temp = Array[i];
        Array[i]= Array[j];
        Array[j]=temp;

    }

    public static void main(String[] args) {
        int [] arr= {87,23,54,67,98,0,1,84,234,43};
        for (int LI=arr.length-1; LI>0; LI--){
            int largest=0;
            for (int i=1; i<=LI; i++){

                if (arr[i]>=arr[largest]){
                    largest=i;

                }
                swapElements(arr,largest,LI);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
