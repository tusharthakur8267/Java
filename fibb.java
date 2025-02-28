package com.company.java;


import com.company.Main;

public class fibb {
    public int fibonacci(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fibb(n-1)+fibb(n-2);
    }
    static int fibb(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fibb(n-1)+fibb(n-2);
    }
    public static void main(String[] args) {
        int s= fibb(6);
        System.out.println(s);




    }
}
