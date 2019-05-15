import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tell me about your triangle App!");
        System.out.print("Introduce first side: ");
        int a = input.nextInt();
        System.out.print("Introduce second side: ");
        int b = input.nextInt();
        System.out.print("Introduce third side: ");
        int c = input.nextInt();

        if (c < a + b) {
            String result = printTriangleType(a, b, c);
            System.out.println("The triangle is " + result);
        } else {
            System.out.println("That is not a triangle!");
        }
    }

    public static String printTriangleType(int a, int b, int c) {
        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c){
            return "isoceles";
        } else {
            return "scalane";
        }
    }
}
