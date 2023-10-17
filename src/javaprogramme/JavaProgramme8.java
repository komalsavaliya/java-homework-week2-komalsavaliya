package javaprogramme;

import java.util.Scanner;

//Write a program to calculate the area of a triangle
public class JavaProgramme8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//open scanner
        System.out.println("Enter the Width of thr Triangle");
        double W = scan.nextDouble();//read value of triangle width
        System.out.println("Enter the Height of the Triangle");
        double H = scan.nextDouble();////read value of triangle height
        scan.close();//scan close
        //Area=(Width*Height)/2
        double area = (W * H) / 2;
        System.out.println("Area of triangle is " + area);
    }
}
