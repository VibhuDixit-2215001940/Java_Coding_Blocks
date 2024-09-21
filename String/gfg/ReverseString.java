//Reverse a string in Java


// Java program to ReverseString using StringBuilder
import java.lang.*;
import java.io.*;
import java.util.*;

public class ReverseString {
    // public static void main(String[] args) {
    //     String str = "Hello World",nstr="";char ch;
    //     for (int i=0; i<str.length(); i++){
    //         ch= str.charAt(i); //extracts each character
    //         nstr= ch+nstr; //adds each character in front of the existing string
    //     }
    //     System.out.println("Reversed word: "+ nstr);//Reversed word: dlroW olleH
    // }
    public static void main(String[] args){
        String input = "Geeks for Geeks";
        StringBuilder input1 = new StringBuilder();// append a string into StringBuilder input1
        input1.append(input);// reverse StringBuilder input1
        input1.reverse();// print reversed String
        System.out.println(input1);//skeeG rof skeeG
    }
    // public static void main(String[] args)
    // {
    //     String str = "Geeks";
 
    //     // conversion from String object to StringBuffer
    //     StringBuffer sbr = new StringBuffer(str);
    //     // To reverse the string
    //     sbr.reverse();
    //     System.out.println(sbr);
    // }
}
