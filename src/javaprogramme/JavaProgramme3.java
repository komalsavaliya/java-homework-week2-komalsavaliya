package javaprogramme;

/**
 * Write a Java programme using the following steps.
 * Declare one instance and one static variable.
 * Declare one instance method.
 * Declare one static method.
 * Call both instance and static variables into both instance and static methods inside the print statement.
 * Declare the Main method.
 * Call both instance and static methods into the Main method and run the programme
 */
public class JavaProgramme3 {
    String name = "Mary John";  //Instance variable
    static int number = 50;//Static Variable

    public static void main(String[] args) {
        JavaProgramme3 a = new JavaProgramme3();//define obj.
        a.m1();//calling instance method in instance obj
        m2();//calling static method
    }

    //m1 is Instance Method
    public void m1() {
        JavaProgramme3 obj = new JavaProgramme3();//calling object
        System.out.println(obj.name);//print name
        System.out.println(number);//print number
    }

    //m2 is Static Method
    public static void m2() {
        JavaProgramme3 obj = new JavaProgramme3();//define obj.
        System.out.println(obj.name);//print name
        System.out.println(number);//print number
    }
}
