package com.Java_Exercise;

public class string_lexic {
    public static void main(String[] args) {
        String s = "welcometojava";
        String smallest = "zzz";
        String largest = "AAA";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        for(int i=0; i<=s.length(); i++){
            for(int j=0; j<=s.length(); j++){
                if((j-i)==3){
                    String a = s.substring(i,j);
                   // System.out.println(a);
                    if(a.compareTo(smallest)<=0){
                        smallest=a;
                        System.out.println("Smallest is: "+smallest);
                    }
                    if(a.compareTo(largest)>=0){
                        largest=a;
                        System.out.println("Largest is: "+largest);
                    }

                }

            }
        }
        System.out.println(smallest+" "+largest);
    }

}
