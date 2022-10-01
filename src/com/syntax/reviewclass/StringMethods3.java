package com.syntax.reviewclass;

public class StringMethods3 {
    public static void main(String[] args) {
        //Method: substring()

        String str= "Hello Class";
       String part2= str.substring(6);
        System.out.println(part2);

        System.out.println("-------------2-------------");
        //if i want to get the word Hello
      String part1=str.substring(0,5);
        System.out.println(part1);

        System.out.println("------------3--------------");
        //if i want to combin two strings
        //Method: concat
        String newString=part1.concat(part2);
        System.out.println(newString);

        //OR
        System.out.println(part1+part2);

        System.out.println("---------------4-----------");
        //If i want to add space
        String newString1=part1.concat(" ").concat(part2);
        System.out.println(newString1);

        //OR
        System.out.println(part1+" "+part2);

        System.out.println("------------5--------------");
        char single=newString.substring(6).charAt(0);
        System.out.println(single);




    }
}
