package com.company;

public class reflected_pyramid {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            for (int j=1; j<=9; j++){
                if (i<6) {
                    if (j >= 6 - i && j <= 4 + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                 else {
                    if (j<=15-i && j>=i-5){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                    }
                }
            System.out.println();
            }
        }
    }

