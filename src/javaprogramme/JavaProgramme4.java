package javaprogramme;

/**
 * Write a Java programme using the following steps.
 * Declare two instance and two static variables.
 * Declare one instance method.
 * Declare one static method.
 * Call all four instance and static variables into both instance and static methods inside the print statement.
 * Declare the Main method.
 * Call both instance and static methods into the Main method and run the programme.
 */
public class JavaProgramme4 {
    // Instance variable
    int k = 50;
    int l = 60;
    //Static variable
    static int a = 40;
    static int b = 80;

    public static void main(String[] args) {
        JavaProgramme4 obj = new JavaProgramme4();//define object
        obj.myMethod();//calling instance method
        m1();//calling static method
    }

    //Instance method
    public void myMethod() {
        JavaProgramme4 a1 = new JavaProgramme4();//calling obj
        System.out.println(a1.k);//print instance variable
        System.out.println(a1.l);//print instance variable
        System.out.println(a);//print static variable
        System.out.println(b);//print static variable
    }

    //Static method
    public static void m1() {
        JavaProgramme4 a1 = new JavaProgramme4();//calling object
        System.out.println(a1.k);//print instance variable
        System.out.println(a1.l);//print instance variable
        System.out.println(a);//print static variable
        System.out.println(b);///print static variable
    }
}

