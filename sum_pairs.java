package com.Java_Exercise;

public class sum_pairs {
    static int[] pairs(int n, int[]arr){
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]+arr[j]==n) {
                    System.out.println("{"+i+","+j+"}");


                }
                }
            }

        return arr;
    }


    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        pairs(7,arr);

    }
}
