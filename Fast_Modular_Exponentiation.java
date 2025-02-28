package com.company;

public class Fast_Modular_Exponentiation {
    static int fastexpo(int a, long n, int MOD ){
        if (n==0){
            return 1;
        }
        if (n%2==0){
            return fastexpo((a*a)%MOD,n/2, MOD);
        }

        return ((a*fastexpo(a,n-1, MOD))%MOD);
    }
    public static void main(String[] args) {

        System.out.println(fastexpo(2,5,5));
    }
}
