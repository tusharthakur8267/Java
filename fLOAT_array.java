package com.company.Array;
import java.util.Scanner;

public class fLOAT_array {
    public static void main(String[] args) {
        float Sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter float values in array");
        float [] arr = new float[5];
        for (int i=0; i<=arr.length-1; i++){
            arr[i]=sc.nextFloat();
        }
        for (int j=0; j<=arr.length-1; j++){
            Sum=Sum+arr[j];
        }
        System.out.println(Sum);

    }
}
