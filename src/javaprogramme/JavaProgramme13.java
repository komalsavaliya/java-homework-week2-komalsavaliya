package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate
 * and print the average of the numbers.
 */
public class JavaProgramme13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//scanner open

        System.out.println("enter the first number");
        int n1 = sc.nextInt();//read vale and save in n1
        System.out.println("enter the second number");
        int n2 = sc.nextInt();//read vale and save in n2
        System.out.println("enter the third number");
        int n3 = sc.nextInt();
        sc.close();//scanner close
        int avg = (n1 + n2 + n3)/3;//formula of average
        System.out.println("the average for the entered numbers is " + avg);
    }
}
