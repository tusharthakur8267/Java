package com.company;
import java.util.Scanner;
public class Strin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n= sc.nextInt();
        // For loop

            Scanner scan = new Scanner(System.in);
            for(int i = 1; scan.hasNext()== true; i++){
                System.out.println(i + " " + scan.nextLine());
            }


// While loop System


            int j = 0;
            while(scan.hasNext()){
                j++;
                System.out.println(j + " " + scan.nextLine());
            }
            Scanner myscanner = new Scanner(System.in);
            int num=0;
            while (myscanner.hasNext()){
                num++;
                System.out.println(num+" "+myscanner.nextLine());
            }


         }
}
