package com.syntax.reviewclass;

public class StringMethods6 {
    public static void main(String[] args) {
        /*How would you reverse a string without using reverse function?
         *1. StringBuilder and its reverse method can be used to reverse a string however, the requirement state to not use reverse function
         * 2. Use charAt();
         * 3. Use toCharArray();
         *
         */

        //1. Use charAt(); to get the last chareacter and then go up to the first character
        String str=" hello";

        String newString="";
        for(int i=str.length()-1; i>0; i--){
            newString=newString+str.charAt(i);
        }

        System.out.println("-----------------------------");
        //2. Use StringBuilder and reverse method

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
