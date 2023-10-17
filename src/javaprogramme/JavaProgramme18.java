package javaprogramme;

/**
 * Write a Java program to print the sum (addition), multiply,
 * subtract, divide and remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class JavaProgramme18 {
    public static void addition(int a, int b) {
        int answer = a + b;
        System.out.println("a + b = " + answer);
    }
    public static void subtraction(int a, int b) {
        int answer = a - b;
        System.out.println("a - b = " + answer);
    }
    public static void multiplication(int a, int b) {
        int answer = a * b;
        System.out.println("a x b = " + answer);
    }
    public static void division(int a, int b) {
        int answer = a / b;
        System.out.println("a / b = " + answer);
    }
    public static void mod(int a, int b) {
        int answer = a % b;
        System.out.println("a % b = " + answer);
    }
    public static void main(String[] args) {
        addition(125, 24);//method for addition
        subtraction(125, 24);//method for subtraction
        multiplication(125, 24);//method for multiplication
        division(125, 24);//method for division
        mod(125, 24);//method for mod
    }
}




