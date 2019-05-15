//I'm intending to approximate the value of number e.

import java.util.Scanner;

public class sumEuler {
    public static void main(String[] args) {
        //System.out.println(factorial(1));
        Scanner input = new Scanner(System.in);
        double e = 1.0;
        System.out.print("How many iterations to approximate the number e do you want? ");
        int aprox = input.nextInt();

        if (aprox > 33) {
            System.out.println("Choose a smaller number.");
        } else {
            for (int i = 1; i <= aprox; i++) {
                e = (1.0 / factorial(i)) + e;
            }
            System.out.println("The approximation is: " + e);
        }
    }

    public static int factorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
