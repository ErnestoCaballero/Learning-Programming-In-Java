import java.util.Scanner;

public class loopWhile {
    public static void main(String[] args) {
        //exercise001();
        //exercise002();
        //exercise003();
        //exercise004();
        mystery(74);
    }

    public static void exercise001() {
        Scanner input = new Scanner(System.in);
        System.out.print("Guess the secret word: ");
        String answer = input.next();

        while (!answer.equals("economics")) {
            System.out.println("That's not the secret word.");
            System.out.print("Try again: ");
            answer = input.next();
        }

        System.out.println("Congratulations, you found it!");
    }

    public static void exercise002() {
        Scanner input = new Scanner (System.in);
        int num = 1;
        int sum = 0;

        while (num != 0) {
            System.out.print("Whats the next number to add (type zero to end)? ");
            num = input.nextInt();
            sum += num;
        }

        System.out.println("The sum is " + sum);
    }

    public static void exercise003() {
        int total = 25;
        int number = 1;

        while (number < (total/2)){
            total = total - number;
            System.out.println(total + " " + number);
            number++;
        }
    }

    public static void exercise004() {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 4; k++) {
                    System.out.print("*");
                }
                System.out.print("!");
            }
            System.out.println();
        }

        System.out.println();

        int i = 1;
        while (i <= 2) {
            int j = 1;
            while (j <= 3) {
                int k = 1;
                while (k <= 4) {
                    System.out.print("*");
                    k++;
                }
                System.out.print("!");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void mystery(int x) {
        int y = 1;
        int z = 0;
        while (2 * y <= x) {
            y = y * 2;
            z++;
        }
        System.out.println(y + " " + z);
    }
}
