package com.Java_Exercise;

public class rough {
    static void count(String s , char ch){
        int count =0;
        for (int i=0; i<s.length(); i++){
            if (ch == s.charAt(i)){
                count++;

            }
        }
        System.out.println("Frequency of "+ch+" in String "+s+" is :- "+count);
    }
    static void frequency(String s){
      int len = s.length();
      int count =0;
      for (int i=0; i<len; i++){
          count(s,s.charAt(i));
      }
    }
    public static void main(String[] args) {
//        String s = "aabbbbaa";
//        int len = s.length();
//        int mid;
//        String nS, ab;
//        String ns;
//        char temp;
//        if (len %2 ==0){
//            mid = len/2;
//            temp = s.charAt(mid);
//            nS = s.substring(0,mid-1);
//            ab = s.substring(mid+1);
//        }
//        else {
//            mid = len/2;
//            temp = s.charAt(mid);
//            nS = s.substring(0, mid);
//            ab = s.substring(mid + 1);
//        }
//
//        System.out.println(nS+" "+ab);
//        char ch;
//        String nn = "";
//        for (int i=0; i<ab.length(); i++){
//           ch = ab.charAt(i);
//           nn = ch+nn;
//        }
//        System.out.println(nn);
//        if (nn.equals(nS)){
//            System.out.println("pandildrome");
//        }
//        else
//            System.out.println("not a Panildrome");

        frequency("ababagggd");
    }
}
