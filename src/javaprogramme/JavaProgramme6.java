package javaprogramme;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.
 * (Formula of Area A=PI*r*r).
 */
public class JavaProgramme6 {
    public static void main(String[] args) {
        double radius, area;
        Scanner input = new Scanner(System.in);//open scanner
        System.out.println("Enter the radius of the circle");
        radius = input.nextDouble();//read value
        input.close();//scanner close
        area = Math.PI * radius * radius;//value of PI
        System.out.println("Area of circle is " + area);
    }
}

