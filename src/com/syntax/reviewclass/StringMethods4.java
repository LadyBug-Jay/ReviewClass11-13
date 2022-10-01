package com.syntax.reviewclass;

public class StringMethods4 {
    public static void main(String[] args) {
        //Method: replace()

        String myString= "Today is September";
        //If i want to say Today is october, i will use the replace method

        myString=myString.replace("September", "October");
        System.out.println(myString);

        myString=myString.replace("T", "t");
        System.out.println(myString);






    }
}
