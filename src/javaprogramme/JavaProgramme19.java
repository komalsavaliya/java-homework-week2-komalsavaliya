package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog
 */
public class JavaProgramme19 {
    public static void main(String[] args) {
        /*String name = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        System.out.println(name.toLowerCase());*/
        Scanner sc1 = new Scanner(System.in);//creating the object for scanner
        System.out.println("Enter the Sample inputs in uppercase: ");//printing the statement
        String str1 = sc1.nextLine();//enter the sample input in uppercase in string data type
        String str2 = str1.toLowerCase();//converting the sample input into lower case
        System.out.println("Output into lower case: " + str2);
       sc1.close();//closing the scanner
    }
}
