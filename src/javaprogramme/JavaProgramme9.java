package javaprogramme;

import java.util.Scanner;

//Write a program to convert the upper case to lower case.
public class JavaProgramme9 {
    public static void main(String[] args) {
        String lowercase;
        Scanner input = new Scanner(System.in);//obj.creation for scanner
        System.out.println("Enter Sentence in Capital");//printing the sentence for user
        lowercase = input.nextLine();//converting the sentence in lowercase and storing value
        input.close();//CLOSING THE SCANNER
        System.out.println(lowercase.toLowerCase());//printing the sentence for convert in lower case
    }
}
