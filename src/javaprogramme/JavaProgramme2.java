package javaprogramme;

/**
 * Write a Java programme using the following steps.
 * Declare two static variables
 * Declare one static method
 * Call both static variables into the static method inside the print statement.
 * Declare the Main method.
 * Call the static method into the Main method and Run the programme
 */

public class JavaProgramme2 {
    static int k = 50;// k is number of student in class
    static String name = "Mary john";//Mary john is teacher name

    public static void main(String[] args) {
        JavaProgramme1 math_class = new JavaProgramme1();//create obj.
        math_class.m1();//method calling in main method
    }

    public static void m1() {
        System.out.println(k);//print number of student in class
        System.out.println(name);// print teacher name
    }
}
