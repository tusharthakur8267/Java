package com.company;
import java.util.Scanner;


public class q3 {



    //    static void Breath(int n){
//
//        return n;
//    }
//    static void height(int n){
//        return n;
//    }
    static void  area(){
         Scanner a = new Scanner(System.in);
         int b=a.nextInt();
         int h =a.nextInt();
         if (b>=0 && h>=0){
            int area = b*h;

            System.out.println(area);
        }
         else
             System.out.println("java.lang.Exception: Breadth and height must be positive");


    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int b= sc.nextInt();
//        int h=sc.nextInt();
//        Breath(b);
//        height(h);
//        area(b,h);
        area();
    }
}
