package com.syntax.reviewclass;

public class StringMethods5 {
    public static void main(String[] args) {

        //Method: split()
        String myStr= "Today is a review class";

        String[] array=myStr.split(" ");//At this stage myString become stored in arrays
        System.out.println(array.length);//5 element
        System.out.println(array[3]);// Going by arrays, the index 3 houses "review"

        //to print out all my indexes i will use loop, and of course for loop because i know the number of iteration

        for(int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("---------another way------------");
        for(String arr:array){
            System.out.println(arr);
        }



    }
}
