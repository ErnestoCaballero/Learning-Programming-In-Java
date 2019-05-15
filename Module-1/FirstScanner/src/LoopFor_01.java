import java.util.Scanner;

public class LoopFor_01 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int sum = 0;
        System.out.print("low? ");
        int low = input1.nextInt();
        System.out.print("high? ");
        int high = input2.nextInt();

        for(int i = low; i <= high; i++){
            System.out.println("i es: " + i + ", sum es = " + sum);
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

}
