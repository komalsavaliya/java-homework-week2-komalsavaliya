package javaprogramme;

import java.util.Scanner;

/**
 * Write a program to insert any temperature
 * value in degree Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class JavaProgramme7 {
    public static void main(String[] args) {
        double F, C;
        Scanner input = new Scanner(System.in);//scanner open
        System.out.println("Enter Fahrenheit");
        F = input.nextDouble();//read value and save in "F"
        input.close();//scanner close
        C = ((F - 32) * 5 / 9);//formula to convert f. to c.
        System.out.println("Temperature in Celsius is " + C);
    }
}
