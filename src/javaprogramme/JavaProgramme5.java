package javaprogramme;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters
 * and use string concatenation methods.methods.(Note: Two static and Two instance
 * methods.)
 */
public class JavaProgramme5 {
    // addition method with static method
    public static void addition(int a, int b) {
        int answer = a + b;
        System.out.println("a+b = " + answer);
    }

    // subtraction method with static method
    public static void subtraction(int a, int b) {
        int answer = a - b;
        System.out.println("a-b = " + answer);
    }

    //multiplication method with instance method
    public void multiplication(int a, int b) {
        int answer = a * b;
        System.out.println("a*b = " + answer);
    }

    //division method with instance method
    public void division(int a, int b) {
        int answer = a / b;
        System.out.println("a/b = " + answer);
    }

    public static void main(String[] args) {
        int a;
        int b;
        Scanner input1 = new Scanner(System.in);//scanner open
        System.out.println("a =");
        a = input1.nextInt();//saving enter value in a
        System.out.println("b =");
        b = input1.nextInt();//saving enter value in b
        input1.close();// scanner close

        addition(a, b);//calling addition method(static)
        subtraction(a, b);//calling subtraction method(static)
        JavaProgramme5 obj = new JavaProgramme5();//create obj.
        obj.multiplication(a, b);//calling multiplication method(instance)
        obj.division(a, b);//calling division method(instance)
    }
}

