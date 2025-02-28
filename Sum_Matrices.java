package com.company.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sum_Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=2;
        int n=3;
        int [] [] arr = new int[m][n];
        int [] [] arr1 = new int[m][n];
        int [] [] sum = new int[m][n];
        for (int i=0; i<= m-1; i++){
            for (int j=0; j<=n-1; j++){
                System.out.println("Enter element of first matrix arr at position ["+ i +"]["+j+"] :-");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int e=0; e<=m-1; e++){
            for (int f=0; f<=n-1; f++){
                System.out.println("Enter element of Second matrix arr1 at position["+ e +"]["+f+"] :-");
                arr1[e][f]=sc.nextInt();
            }
        }
      for(int s=0; s<=m-1; s++ ){
          for (int t=0; t<=n-1; t++){
              sum[s][t]=arr[s][t]+arr1[s][t];
          }
      }
        System.out.print("{");
        for (int []elements: sum) {

            for (int e : elements) {


                System.out.print(e+",");
            }
//            System.out.print("} ");
            System.out.println();
        }
        System.out.print(" }");
    }
}
