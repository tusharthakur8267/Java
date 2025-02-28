package com.company.Array;
import java.util.Arrays;



public class sort_an_array {

    public static void main(String[] args) {
        int a,i,j;
        //int [] arr = new int[5];
        int[] arr={5,2,4,6,1,3};


//        Arrays.sort(arr);
//        System.out.println("Modified arr[] : "+Arrays.toString(arr));
        for (i=0; i<=(arr.length-1); i++){
            for (j=i+1; j<=(arr.length-1); j++){
                if (arr[i]<arr[j]){
                    a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;

                }
            }
        }
       for (int c=0; c<=arr.length-1; c++){
           System.out.println(arr[c]);
       }


    }


}
