import java.util.Random;
import java.util.Scanner;

public class OddsAndEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String type = "";
        int fingers = 0;

        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.print("What is your name? ");
        String name = input.next();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        type = input.next();

        if (type.equals("E") || type.equals("O")) {
            if (type.equals("O")) {
                System.out.println(name + " has picked odds! The computer will be evens.");
            } else {
                System.out.println(name + " has picked evens! The computer will be odds.");
            }

            for (int i = 0; i < 60; i++) {
                System.out.print("-");
            }

            System.out.println();

            System.out.print("How many \"fingers\" do you put out? ");
            fingers = input.nextInt();

            Random rand = new Random();
            int computer = rand.nextInt(6);

            System.out.println("The computer plays " + computer + " \"fingers\"");
            for (int i = 0; i < 60; i++) {
                System.out.print("-");
            }
            System.out.println();

            int sum = fingers + computer;
            System.out.println(fingers + " + " + computer + " = " + sum);

            if (sum % 2 == 0) {
                System.out.println(sum + " is ...even!");
                if (type.equals("E")) {
                    System.out.println("That means " + name + " wins! :)");
                } else {
                    System.out.println("That means The computer wins!");
                }
            } else {
                System.out.println(sum + " is ...odd!");
                if (type.equals("O")) {
                    System.out.println("That means " + name + " wins! :)");
                } else {
                    System.out.println("That means The computer wins!");
                }
            }

            for (int i = 0; i < 60; i++) {
                System.out.print("-");
            }
        } else {
            System.out.println("Try again.");
        }
    }
}
