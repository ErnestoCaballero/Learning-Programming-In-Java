import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {
        //multTables();
        //matrixFive();
        //identityMatrix();
        //exercise27();
        //exercise28();
        //exercise29();
        //exercise210();
        //exercise211();
        //exercise212();

    }

    public static void multTables() {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("To what number you want the multiplication tables? ");
        number = input.nextInt();
        int[] myArray = new int[number];

        for (int i = 1; i <= number; i++) {
            myArray[i] = i;
        }

        for (int i = 1; i <= number; i++) {

        }
    }

    public static void matrixFive() {

        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void identityMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Set the matrix size: ");
        int size = input.nextInt();

        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row == column) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void exercise27() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                if (i == j) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void exercise28() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > 0; j--) {
                if (i >= j) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void exercise29() {

        for (int i = 0; i < 4; i++) {
            if (i == 0 || i == 3) {
                for (int j = 0; j < 40; j++) {
                    System.out.print("-");
                }
            } else if (i == 1) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print("_-^-");
                }
            } else {
                for (int k = 0; k < 2; k++){
                    for (int j = 1; j < 10; j++) {
                        System.out.print( j + "" + j);
                    }
                    System.out.print("00");
                }
            }
            System.out.println();
        }
    }

    public static void exercise210() {
        for (int i = 1; i <= 60; i++) {
            if (i % 10 == 0) {
                System.out.print("|");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(j);
            }
            System.out.print(0);
        }
    }

    public static void exercise211() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many repetitions do you want? ");
        int rep = input.nextInt();
        System.out.print("What range of numbers do you want? ");
        int range = input.nextInt();

        for (int i = 0; i < rep; i++) {
            for (int j = 1; j < range; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();

        for (int i = 0; i < rep; i++) {
            for (int j = 1; j < range; j++) {
                System.out.print(j);
            }
            System.out.print(0);
        }
    }

    public static void exercise212() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void question02() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 11; j++) {

            }
        }
    }
}