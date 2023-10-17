package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints
 * its multiplication table up to 10.
 * Test Data: input a number:8
 * Expected Output:
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * .....
 * 8 x 4 = 32
 */
public class JavaProgramme10 {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter number for multiplication table");
        Scanner input = new Scanner(System.in);//scanner open
        number = input.nextInt();//read value
        System.out.println(number + " x 1 = " + number);
        System.out.println(number + " x 2 = " + number * 2);
        System.out.println(number + " x 3 = " + number * 3);
        System.out.println(number + " x 4 = " + number * 4);
        System.out.println(number + " x 5 = " + number * 5);
        System.out.println(number + " x 6 = " + number * 6);
        System.out.println(number + " x 7=  " + number * 7);
        System.out.println(number + " x 8 = " + number * 8);
        System.out.println(number + " x 9 = " + number * 9);
        System.out.println(number + " x 10= " + number * 10);
        input.close();//scanner close
    }
}
