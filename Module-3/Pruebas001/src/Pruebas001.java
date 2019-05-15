import java.util.Scanner;

public class Pruebas001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me an int: ");
        int num = input.nextInt();

        //System.out.println(starString(num));
        //System.out.println(fibonacci(num));
        writeNums(num);

        /*String prueba = "hola";
        int number = 2;
        String res = prueba + number;
        System.out.println(res);*/
    }


    public static String starString(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("number must be positive.");
        } else if (num == 0) {
            return "*";
        } else if (num == 1) {
            return "**";
        } else {
            return starString(num - 1) + starString(num - 1);
        }
    }

    public static int fibonacci(int num) {
        if (num == 0) {
            return 1;
        } else if (num == 1){
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num-2);
        }
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    //This method print all consecutive numbers from 1 to the parameter num recursively. F(3) = 1, 2, 3
    public static void writeNums(int num) {
        if (num == 1) {
            System.out.print(num);
        } else {
            writeNums(num - 1);
            System.out.print(", " + num);
        }
    }


}
