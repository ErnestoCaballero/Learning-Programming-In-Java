/*
Example of a main method calling different methods from top to buttom.
Made by Ernest. Date: February 24, 2019.
 */

public class Methods_01 {
    public static void main(String[] args) {
        message1();                         //Llamo al método message1.
        message2();                         //Call the message2 method.
        System.out.println("Done with main.");
        System.out.println("Hola"+" adios"); //ejemplo de concatenamiento.
    }

    public static void message1(){
        System.out.println("This is message1");
    }

    public static void message2(){
        System.out.println("This is message2");
        message1();
        System.out.println("This is message2");
    }
}
