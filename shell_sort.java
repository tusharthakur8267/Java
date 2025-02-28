package com.DSA;

import java.util.Arrays;

public class shell_sort {
    public static void main(String[] args) {
        int [] arr= {-1,122,30,51,13,-348,1};
        for (int gap=arr.length/2; gap>0; gap/=2){

            for (int i=gap; i<arr.length; i++){
                int newelement=arr[i];
                int j=i;
                while(j >=gap && arr[j-gap]>newelement){
                    arr[j]=arr[j-gap];
                    j -= gap;

                }
                arr[j]=newelement;



            }

        }
        System.out.println(Arrays.toString(arr));
    }

}
