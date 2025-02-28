package com.Java_Exercise;

public class common_elements {
    public static void main(String[] args) {
        String [] arr1={"C","C++","java","python","java Script","C","C++"};
        String [] arr2={"Ca","bC++","vjava","dpython","java Script","eC","fC++"};

        for (int i=0; i< arr1.length; i++){
            for (int j=0; j<arr2.length; j++){
                if (arr1[i]==arr2[j])
//                    if(arr1[i].equals(arr2[j]))
                {
                    System.out.println(arr2[j]);
                }
            }
        }
    }
}
