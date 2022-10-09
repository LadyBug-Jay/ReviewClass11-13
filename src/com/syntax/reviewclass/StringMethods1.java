package com.syntax.reviewclass;

public class StringMethods1 {
    public static void main(String[] args) {
        //Method: toUpperCase and toLowerCase

      String str="hello";
      str.toUpperCase();//Because of string immutability we can not change the string, this does not have a variable. the object which is upper case "HELLO"is created but was not assigned to any variable hence java will not print the upper case
        System.out.println(str);
        System.out.println("-----------------------------");

        str=str.toUpperCase();//Here we have reassigned the variable "str" hence java will be able to print to upper case
        System.out.println(str);


        //Method: length()---> gives the size

        int size=str.length();
        System.out.println(size);

        //Method; charAt()-----> Returns the char value at the specified index
       char letter= str.charAt(0);
        System.out.println(letter);

        //How to get the last character of a string
        char lastCharacter=str.charAt(str.length()-1);
        System.out.println(lastCharacter);

        //Method: indexOf----> it returns the index within the string of the first occurrence of the specified character
        int index=str.indexOf(lastCharacter);
        System.out.println(index);

        System.out.println(str.indexOf('a'));//When it doesn't find it, it returns -1

        // Method: isEmpty()
        boolean empty=str.isEmpty();

        //Method: trim()-----> remove spaces at the beginning and at the end




    }
}
