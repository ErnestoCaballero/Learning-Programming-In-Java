import java.util.Scanner;

public class LongestName {
    public static void main(String[] args) {
        int numNames = 0;
        Scanner console = new Scanner(System.in);
        System.out.print("How many names do you want? ");
        numNames = console.nextInt();
        longName(console, numNames);
    }

    public static void longName(Scanner input, int number) {
        boolean tie = false;

        System.out.print("name #1? ");
        String winner = input.next();

        for (int i = 2; i <= number; i++) {
            System.out.print("name #" + i + "? ");
            String name = input.next();

            if (name.length() == winner.length()) {
                tie = true;
            }

            if (name.length() > winner.length()) {
                winner = name;
            }

        }
        String caseWinner = winner.substring(0,1).toUpperCase() + winner.substring(1).toLowerCase();
        System.out.println(caseWinner + "'s name is longest");

        if (tie == true) {
            System.out.println("(There was a tie!)");
        }
    }

    public static void pruebasString() {
        String palabra = "excEpcioNal";
        System.out.println("La palabra " + palabra + " tiene " + palabra.length() + " letras.");
        String word = palabra.substring(0,1).toUpperCase()+palabra.substring(1).toLowerCase();
        System.out.println(word);
    }

}
