/*
    Made by Ernesto on february 25, 2019. Here I'll try to get a little used to Scanners and how to store data from
    the console.
 */

import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {
        Welcoming();
        askAge();
        askWeight();
    }

    public static void Welcoming(){
        Scanner input1 = new Scanner(System.in); //create the object Scanner.
        System.out.println("Welcome!");
        System.out.println("What is your name?");
        String name = input1.nextLine(); //Show in the console a space to fill the name.
        System.out.println("Hello, " + name);
    }

    public static void askAge(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("\nHow old are you?");
        int age = input1.nextInt();
        System.out.println(age + " Is a very cool age!");
    }

    public static void askWeight() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("\n\tHow much do you weight in Kg?");
        Double weight = input1.nextDouble();
        int prueba = (int) (weight * 2);                            //Example of CASTING. Turning a double into an int.
        System.out.println(prueba + " Thst's like, a lot. *o*");
    }
}
