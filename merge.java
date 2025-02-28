package com.DSA;

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {

        int [] arr= {-1,122,30,51,13,-348,1};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergesort(int [] arr, int start , int end){
        if (end-start< 2){
            return;
        }
        int mid = (start+end)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid,end);
        merge(arr,start,mid,end);
    }
    static void merge(int[] arr,int start, int mid, int end){
        if (arr[mid-1]<arr[mid])
            return;

        int i=start;
        int j= mid;
        int tempindex= 0;
        int [] temp = new int[end-start];
        while(i<mid && j<end){
            temp[tempindex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        System.arraycopy(arr, i, arr, start + tempindex, mid -i);
        System.arraycopy(temp,0,arr,start,tempindex);

    }

}
