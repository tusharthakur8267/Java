package com.DSA;

import java.util.Arrays;

public class bubbleSort {
    static void swapElements(int[] Array, int i, int j){
        if (i==j){
            return;
        }
        int temp = Array[i];
        Array[i]= Array[j];
        Array[j]=temp;

    }
    static void insertionsort(int [] Array){
        for (int firstUnsortedIndex=1; firstUnsortedIndex<Array.length; firstUnsortedIndex++){
            int newElement =Array[firstUnsortedIndex];
            int i;
            for (i=firstUnsortedIndex; i>0 && Array[i-1]>newElement; i--){
                Array[i]=Array[i-1];

            }
            Array[i]=newElement;
        }
    }
    public static void main(String[] args) {
        int [] arr= { 11,10,9,8,7,0,6,5,4,3,2,1};
        System.out.println("Array before sorted :"+Arrays.toString(arr));
//        for (int lastindex=arr.length-1; lastindex>0; lastindex--){
//            for(int i=0; i<lastindex; i++){
//                if (arr[i]>arr[i+1]){
//                    swapElements(arr,i,i+1);
//                }
//            }
//        }
        insertionsort(arr);

       System.out.println(Arrays.toString(arr));
    }

}
