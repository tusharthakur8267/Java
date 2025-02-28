package com.company;

public class Main {

    public static void main(String[] args) {
	    // pyramid star pattern
        for(int i=1; i<=5; i++){
            for(int j=1; j<=9; j++){
                if (j<=4+i && j>=6-i){
                    System.out.print(i);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
