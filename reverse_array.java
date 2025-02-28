package com.company.Array;
// maximum element in array
public class reverse_array {
    public static void main(String[] args) {
        int [] arr =  {51,2,3,4,5};
        int max=0,min;
        for(int i=0; i<=arr.length-1; i++){
            if (arr[i]>=max){
                max=arr[i];

            }
        }
        System.out.println(max);
    }
}
