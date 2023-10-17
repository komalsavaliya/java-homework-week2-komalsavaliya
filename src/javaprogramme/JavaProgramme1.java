package javaprogramme;

/**
 * Write a Java programme using the following steps.
 * Declare two instance variables.
 * Declare one instance method.
 * Call both instance variables into the instance method inside the print statement.
 * Declare the Main method.
 * Call the above instance method into the Main method and Run the programme
 */

public class JavaProgramme1 {
    // Instance Variable
    int age = 50; // teacher age
    String name = "Mary John";// teacher name

    //Declare main method
    public static void main(String[] args) {
        JavaProgramme1 teacher_math = new JavaProgramme1();//define object
        teacher_math.m1();//calling method
    }

    //Instance method declare
    public void m1() {
        JavaProgramme1 teacher = new JavaProgramme1();//define object
        System.out.println(teacher.age);//print the age
        System.out.println(teacher.name);//print teacher name
    }
}
