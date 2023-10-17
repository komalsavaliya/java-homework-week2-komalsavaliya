package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class JavaProgramme14 {
    public static void main(String[] args) {
        //Area of Rectangle
        Scanner scan = new Scanner(System.in);//scanner open
        System.out.println("Enter the Width of thr rectangle");
        double W = scan.nextDouble();//read value of width
        System.out.println("Enter the Height of the rectangle");
        double H = scan.nextDouble();//read value of height
        scan.close();//scanner close
        //Area= (Width * Height);
        double area = (W * H);//formula of rectangle
        System.out.println("Area of rectangle is " + area);//print area using string concatination
        double perimeter = 2 * (W + H);//formula of perimeter
        System.out.println("Perimeter of rectangle is  " + perimeter);
    }
}





