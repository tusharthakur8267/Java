package com.company;

public class mirror_pyramid {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            for (int j=1; j<=9; j++){
                if (i<6){
                    if (j>=i && j<=10-i){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else {
                    if (j>=11-i && j<=i-1){
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
