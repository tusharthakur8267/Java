package com.company;




class prime_Factorization{

     static int [] value= new int[100];
     static int [] expo = new int[100];
     static int len;
     static void prime_Factor(int n){
         int d=2;
         if (n==1){
             len++;
             value[len]=2;
             expo[len]=0;
         }
         while (n>=d*d && n>1){
             int k=0;
             while (n%d==0){
                 k++;
                 n/=d;

             }
             if (k>0){
                 len++;
                 value[len]=d;
                 expo[len]=k;
             }
             d++;
         }
         if (n>1){
             len++;
             value[len]=n;
             expo[len]=1;
         }
     }

    public static void main(String[] args) {
         prime_Factor(12505);
         for (int i=1; i<=len; i++){
            System.out.print(value[i]+" ^ "+expo[i]);
             System.out.print(",");
        }

    }
}