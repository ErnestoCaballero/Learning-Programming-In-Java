import java.util.Scanner;

public class SecondScanner {
    public static void main(String[] args) {
        inputBirthday();
        processName();
    }

    public static void inputBirthday(){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        System.out.print("On what day of the month were you born? ");
        int day = input1.nextInt();
        System.out.print("What is the name of the month in which you were born? ");
        String month = input2.next();
        System.out.print("During what year were you born? ");
        int year = input3.nextInt();
        System.out.print("You were born on " + month + " "+day+", "+year+". You're mighty old!\n");
    }

    public static void processName(){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String first = input1.next();
        String last = input2.next();
        System.out.print("Your name in reverse order is "+ last + ", " +first);
    }
}
