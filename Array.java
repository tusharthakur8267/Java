package com.Java_Exercise;

import java.util.Arrays;
//Array sorting using Java methods
public class Array {
    static void duplicate(int arr[]){
        for (int i=0; i<arr.length; i++){
            for (int  j=i+1; j<arr.length; j++){
                if ((arr[i]==arr[j]) && (i !=j)){
                    System.out.println(arr[i]);
                }
            }
        }
    }

        static void duplicate_string(String arr[]){
            for (int i=0; i<arr.length; i++){
                for (int  j=i+1; j<arr.length; j++){
                    if ((arr[i]==arr[j]) && (i !=j)){
                        System.out.println(arr[i]);
                    }
                }
            }
        }
    static void min_max(int arr[]){
        int i=0;
        int min=0;
        int max=0;
        for (int element:arr
             ) {
            for (int value:arr
                 ) {
                if(value<element ){
                    min=value;

                }
                if( value>element)
                    max=value;
            }
        }
        System.out.println(min+" "+ max);
    }
    public static void main(String[] args) {
//        int [] num = {19,12,4,6,34,545,343};
//        double [] flo= {332.4,545.3,543.3545,343.12,1.11};
//        String [] str= {"C++","JAVA","C","Python","JAVA SCRIPT"};
//        System.out.println("Original array is:"+ Arrays.toString(num));
//        Arrays.sort(num);
//        System.out.println("Original array is:"+ Arrays.toString(flo));
//        Arrays.sort(flo);
//        System.out.println("Sorted array is :"+Arrays.toString(num));
//        System.out.println("Sorted array is :"+Arrays.toString(flo));
//        System.out.println("Original array is: "+Arrays.toString(str));
//        Arrays.sort(str);
//        System.out.println("sorted array is :"+Arrays.toString(str));

        int [][] arr= new int[10][10];
        int [] arr1 ={3,1,234,3543,43,4,2,4,5555,0,1,3};
        String [] arr2={"C","C++","java","python","java Script","C","C++"};
//        for (int i=0; i<10; i++){
//            for(int j=0; j<10; j++){
//                System.out.print("     ");
//                System.out.print(" "+arr[i][j]);
//            }
//            System.out.println();
//        }
//        min_max(arr1);
//        duplicate(arr1);
        duplicate_string(arr2);
    }
}
