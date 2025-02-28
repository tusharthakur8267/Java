package com.Java_Exercise;

import java.util.Arrays;

public class Sum_Elements {

    static void insert(int arr[],int n, int index){
       for (int i=arr.length-1; i>index;i--){
           arr[i]=arr[i-1];
       }
       arr[index]=n;
        System.out.println(Arrays.toString(arr));
    }
    static void copying(int arr[], int arr1[]){
        int i=0;
        for (int element:arr
             ) {
            arr1[i]=element;
            i++;
        }
        System.out.println("Copies Array is :"+Arrays.toString(arr1));
    }
    static boolean contained(int arr[], int n){
        for (int element:arr
             ) {
            if (n==element)
                return true;

        }

        return false;
    }
    static void delete(int arr[], int n){
        System.out.println("Array before deleting the element "+Arrays.toString(arr));
        for (int i=n; i<arr.length; i++){
           arr[n]=arr[n+1];
       }
        System.out.println("Array after deleting the element"+ Arrays.toString(arr));
    }
    static int indexes(int arr[],int n){
        int i=-1;
        for (int element:arr
             ) {
            i++;
            if (n==element){
                return i;
            }
        }
        return -1;
    }

    static double Average(int arr[]){
        int i=0;
        int sum=0;
        for (int element:arr
             ) {
            i++;
            sum +=element;
        }
        double value =sum/i;
        System.out.println("how many values in arrray : "+i);
        return value;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7454};
        int [] arr1 =new int[7];

//        int sum=0;
//        for (int element:arr
//             ) {
//            sum +=element;
//
//        }
//        System.out.println(sum);

//        System.out.println(Average(arr));
//        System.out.println(contained(arr,7454));

//        System.out.println(indexes(arr,0));
//        delete(arr,1);
//        copying(arr,arr1);
        insert(arr,12,3);
    }
}
