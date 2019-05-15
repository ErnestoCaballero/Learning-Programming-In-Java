import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type an integer: ");
        int number1 = input.nextInt();
        int z = number1 * 2;
        System.out.println(number1 + " times 2 = " + z);
    }
}
