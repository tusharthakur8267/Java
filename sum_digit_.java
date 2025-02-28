package com.company.java;

public class sum_digit_ {
    static int sum(int n){

        if (n==0 || n<0){
            return 0;
        }

        return n%10 + sum(n/10);
    }
    static int power(int n, int p){
        if (n==0){
            return 0;
        }
        if (p==0){
            return 1;
        }

        return n*power(n,p-1);

    }
    static int gcd(int n, int d){
        if (n<0 && d<0)
            return -1;
        if (d==0){
            return n;
        }
        return gcd(d,n%d);
    }
    static int decimal_binary(int n){
        if (n<0){
            return -1;
        }
        if (n==0)
            return 0;
        return n%2 + 10* decimal_binary(n/2);
    }
    public static void main(String[] args) {
//        int a=sum(-120340);
//        System.out.println(a);
//        System.out.println(power(2,3));
//        System.out.println(gcd(1,1));

        System.out.println(decimal_binary(13));
    }

}
