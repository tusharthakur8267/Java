package com.company.Array;

public class Average {
    public static void main(String[] args) {
//        int [] arr = new int [5];
        int [] arr  = {57,71,83,58,68};
        float Average=0;
        for(int element:arr){
//            System.out.println(element);
            Average+= (float)  (element);
        }
        float average= Average/5;
        System.out.println("Average of marks is:-"+average);

    }
}
