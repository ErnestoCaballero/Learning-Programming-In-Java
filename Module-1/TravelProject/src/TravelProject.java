/*
    This project was made by Ernesto. Starting date february 25, 2019. The objective is to use most of whats been
    introduced in the module one of the program by Microsoft "Learn to program in Java": the first of three courses offered
    to learn Java.
 */
import java.util.Scanner;

public class TravelProject {
    public static void main(String[] args) {
        //greetings();
        //timeBudget();
        //timeDiff();
        //squareArea();
        distanceHaversine();
    }

    public static void greetings() {
        System.out.println("Welcome to Vacation Planner!");
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you, "+name+", where are you travelling to? ");
        String destination = input.nextLine();
        System.out.println("Great! "+destination+" sounds like a great trip.\n");
    }

    public static void timeBudget() {
        Scanner input = new Scanner(System.in);
        System.out.print("Hoy many days are you going to spend on your trip? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        int money = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = input.next();
        System.out.print("How many "+currency+" are there in 1 USD? ");
        double forex = input.nextDouble();
        System.out.println("\nIf you are travelling for "+days+" days, that is the same as "+ days*24+ " hours or "+days*24*60 + " minutes.");
        double perDay = (double)((int)((double)money/days*100))/100;
        System.out.println("If you are going to spend $"+money+" USD, that means per day you can spend up to $"+perDay+" USD.");
        double budgetForeign = forex * money;
        double perDay2 = (double)(int)(budgetForeign/days*100)/100;
        System.out.println("Your total budget in " + currency + " is " + budgetForeign + " " + currency + ", which per day is " + perDay2 + " " + currency);
    }

    public static void timeDiff() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhat is the time difference, in hours, between your home and your destination? ");
        int difference = input.nextInt();
        System.out.println("That means that when it is  midnight at home it will be " + difference +":00 in your travel destination.");
        System.out.println("and when it is noon at home it will be " + (12 + difference) + ":00.");
    }

    public static void squareArea(double v) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhat is the square area of your destination country in km2? ");
        double area = input.nextDouble();
        double area1 = (double)((int)(area*.621371*100))/100;
        System.out.println("In miles2 that is "+area1);
    }

    public static void distanceHaversine(){
        System.out.println("\nNow lets calculate the distance from your home to your travel destination!");
        Scanner input = new Scanner(System.in);
        System.out.print("Give me the longitude of your home: ");
        double longt1 = input.nextDouble();
        System.out.print("Give me the latitude of your home: ");
        double latit1 = input.nextDouble();
        System.out.print("Give me the longitude of your destination: ");
        double longt2 = input.nextDouble();
        System.out.print("Give me the latitude of your destination: ");
        double latit2 = input.nextDouble();
        //Here I'll use the Haversine Formula to calculate the great-circle distance:
        double res = 2*(6367.44)*Math.asin(Math.sqrt(Math.pow( Math.sin((latit2-latit1)/2),2)+
                Math.cos(latit1)*Math.cos(latit2)*Math.pow(Math.sin((longt2-longt1)/2),2)));
        double res01 = (int)(res*100)/100.0;
        System.out.println("\nThe distance from your home to your travel destination is: "+res01);
    }
}
