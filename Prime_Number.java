package com.company;

public class Prime_Number {
    static Boolean isPrime(int n) {

        if (n <= 1) {

            return false;
        }

            else{
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {

                    return false;

                }
            }

            return true;

        }
    }
    public static void main(String[] args) {

        System.out.println(isPrime(8));
    }

}
