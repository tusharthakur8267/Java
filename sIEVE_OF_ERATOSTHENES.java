package com.company;


public class sIEVE_OF_ERATOSTHENES {
    private static final int Nmax = 100001;
    static boolean [] isPrime =new boolean[Nmax];

    static void Sieve_of_Eratosthenes(int n){
        for (int i=2; i<=n; i++){
            isPrime[i]=true;
        }
        for (int i=2; i<=n/2; i++){
            if (isPrime[i]){
                for (int j=i*2; j<=n; j+=i){
                    isPrime[j]=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Sieve_of_Eratosthenes(3);
        for (int i=2; i<=100; i++){
            if (isPrime[i]){
                System.out.print(i+" ,");
            }
        }
    }
}
