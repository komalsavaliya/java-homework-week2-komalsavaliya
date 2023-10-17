package javaprogramme;

/**Write a Java program to swap two variables.*/
public class JavaProgramme15 {
    public static void main(String[] args) {
        String a = "Mary";
        String b = "John";
        String c = a;//saving vale of "a" in temporarily in "c"
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //swapping the variable
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
