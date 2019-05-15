import java.util.Scanner;

public class BooleansPractice {
    public static void main(String[] args) {
        //method01();
        // method02();
        //method03();
        //method04();
        //method05();
        //method06();
        //method07();
        //method08();
        method09(); //For loop practice 1
    }

    public static void method01(){
        Scanner input = new Scanner(System.in);
        System.out.print("What was your grade? ");
        int grade = input.nextInt();

        if (grade>70) {   //Here it happens the boolean test.
            System.out.println("You've been admited!");
        }

        System.out.println("\nEnd of \"if\" Statement");
    }

    public static void method02(){
        Scanner input = new Scanner(System.in);
        System.out.print("What was your grade? ");
        int grade = input.nextInt();

        if (grade>70) {   //Here it happens the boolean test.
            System.out.println("You've been admited!");
        } else {
            System.out.println("Appply again!");
        }

        System.out.println("\nEnd of \"if\" Statement");
    }

    public static void method03() {
        Scanner input = new Scanner(System.in);
        System.out.print("What was your grade? ");
        int grade = input.nextInt();

        if (grade > 80) {   //Here it happens the boolean test.
            System.out.println("You've been admited!");
        } else if (grade > 60) {
            System.out.println("You're in the waiting list");
        } else {
            System.out.println("Apply again!");
        }

        System.out.println("\nEnd of \"if\" Statement");
    }

    public static void method04() {
        Scanner input = new Scanner(System.in);
        System.out.print("What was your grade? ");
        int grade = input.nextInt();

        if (grade > 80) {   //Here it happens the boolean test.
            System.out.println("You've been admited!");
        }

        if (grade > 60) {
            System.out.println("You're in the waiting list");
        } else {
            System.out.println("Apply again!");
        }

        System.out.println("\nEnd of \"if\" Statement");
    }

    public static void method05() {
        Scanner console = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = console.nextInt();
        if (number % 2 == 0) {
            if (number % 3 == 0) {
                System.out.println("Divisible by 6.");
            }
        } else {
            System.out.println("Odd.");
        }
    }

    public static void method06() {
        Scanner console = new Scanner(System.in);
        System.out.print("What is your favorite colour? ");
        String name = console.next();

        if (name.equals("blue")){
            System.out.println("Mine, too!");
        }
    }

    public static void method07() {
        int base = 2;
        int powder = 4;
        int res = 1;

        if (powder == 0) {
            System.out.println(1);
        } else {
            for (int i = 0; i < powder; i++) {
                res *= base;
                System.out.println(res);
            }
        }
    }

    public static void method08(){
        Scanner input = new Scanner(System.in);
        System.out.print("What color do you want? ");
        String color = input.nextLine();

        if (color.equals("b") || color.equals("B")) {
            System.out.println("You have chosen Blue.");
        } else if (color.equals("g") || color.equals("G")){
            System.out.println("You have chosen Green.");
        } else if (color.equals("r") || color.equals("R")){
            System.out.println("You have chosen Red.");
        } else {
            System.out.println("Unknown color: " + color);
        }
    }

    public static void method09(){
        for (int i = 0; i < 4; i++){
            System.out.println("+-+-+-+");
        }
    }
}
