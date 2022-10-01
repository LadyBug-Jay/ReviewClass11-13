package com.syntax.reviewclass;

public class StringMethods6 {
    public static void main(String[] args) {
        /*How would you reverse a string without using reverse function?
         *1. Use StringBuilder and reverse method
         * 2. Use charAt();
         * 3. Use toCharArray();
         *
         */

        //Use charAt();
        String str=" hello";

        String newString="";
        for(int i=str.length()-1; i>0; i--){
            newString=newString+str.charAt(i);
        }

        System.out.println("-----------------------------");
        //Use StringBuilder and reverse method

        StringBuilder sb=new StringBuilder("hello");
        sb.reverse();
        System.out.println(sb);

        System.out.println("-----------------------------");

        String s= "Class is almost over";
        StringBuilder sb2=new StringBuilder(s);
        sb2.reverse();
        System.out.println(sb2);





    }
}
