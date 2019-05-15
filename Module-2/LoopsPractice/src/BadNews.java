import java.util.Scanner;

public class BadNews {
    public static final int MAX_ODD = 21;

    public static void main(String[] args) {
        writeOdds();

        //printOdds();
    }

    public static void writeOdds() {
        for (int i = 1; i <= (MAX_ODD - 2); i++) {
            System.out.print(i + " ");
            i = i + 1;
        }

        System.out.print(MAX_ODD);


    }

    public static void printOdds() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many odds do you want me to show? ");
        int number = input.nextInt();

        for (int i = 0; i <= number * 2; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void primesList() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many primes do you want me to show?");
        int numPrimes = input.nextInt();

    }
}

