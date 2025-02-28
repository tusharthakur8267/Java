package com.company;
import java.io.*;
class Conversion{
    int binarytoDecimal(long binary){
        int decimalnumber =0, i=0;
        while (binary>0){
             decimalnumber += Math.pow(2,i++) * (binary%10);
             binary /=10;

        }
        return decimalnumber;
    }
    int decimaltoOctal(long binary){
        int decimal = binarytoDecimal(binary);
        String octalstring = Integer.toOctalString(decimal);
        System.out.println(octalstring);
        int OctalNumber = Integer.parseInt(octalstring);
        return OctalNumber;
    }
    int OctaltoDecimal(String Octalnumber){
        int Number;
        String abc = Octalnumber;
        Number = Integer.parseInt(abc,8);
        return Number;
    }
    int DecimaltoOctall(int Decimal){
        String octalstring = Integer.toOctalString(Decimal);
        return Integer.parseInt(octalstring);
    }
    int decimalToBinary(int n){
         int i=0;
         int b=n;
        int[] arr= new int[60];

        while(n>0){

            arr[i]=n%2;
           n=n/2;
           i++;
        }
//        System.out.println(i);
        for (int j=i-1; j>=0; j--){
            System.out.print(arr[j]);
        }


        return 0;

    }
    void booleantoString(Boolean value){
        String a = Boolean.toString(value);

        System.out.println(a);
    }
    void strToDouble(String x){
        double d = Double.parseDouble(x);
        System.out.println(d);
    }
// Double to String --
//String output = String.valueOf(number);
/*
number is in double type
and output is in string format...
String.valueof(Double); is used.
 */


}

public class Decimal_Octal {
    public static void main(String[] args) {
        Conversion c1 = new Conversion();
       // System.out.println(c1.binarytoDecimal(1111));
//        System.out.println(c1.decimaltoOctal(100100));
        //System.out.println(c1.OctaltoDecimal("157"));
//        c1.decimalToBinary(1111);
//        c1.booleantoString(true);
        c1.strToDouble("111.225");
    }
}
