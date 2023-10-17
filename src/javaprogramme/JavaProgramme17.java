package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data: Input a Decimal Number : 5
 * Expected Output Binary number is: 101
 */
public class JavaProgramme17 {
    public static void main(String[] args) {
        /*int a = 5;
        //convert into binary number
        System.out.println("Sum of two binary number " + (Integer.toBinaryString(a)));
        */
        Scanner sc = new Scanner(System.in);//creating the object for scanner
        System.out.println("Enter decimal number:  ");//printing the decimal number for
        double x = sc.nextDouble();//storing the decimal value in "x" double
        String y = Integer.toString((int) x);//stored staring "y" for converted double value
        int z = Integer.parseInt(y);// Converting the string to integer value
        String binary = Integer.toBinaryString(z);//converting integer value to binary value
        System.out.println("Binary number is: " + binary);//printing the binary number
        sc.close();// closing the scanner
    }
    }
