package com.syntax.reviewclass;

public class StringMethods2 {
    public static void main(String[] args) {

        //Method: trim()

        String textFromApplication= "  Enroll today";
        String textFromUserStory= "Enroll today";
        if (textFromApplication.equals(textFromUserStory)) {
            System.out.println("Text matches. Test Pass");
        }else{
            System.out.println("Text does not match. Test failed");
        }
        System.out.println(textFromApplication.trim());
        System.out.println(textFromApplication);

        System.out.println("--------------------");

        if (textFromApplication.trim().equals(textFromUserStory)) {//using method chaining
            System.out.println("Text matches. Test Pass");
        }else{
            System.out.println("Text does not match. Test failed");
        }











    }
}
