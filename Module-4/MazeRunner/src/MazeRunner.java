import java.util.Scanner;

public class MazeRunner {
    public static void main(String[] args) {
        Maze myMap = new Maze();
        Scanner input = new Scanner(System.in);
        String direction;
        int moves = 1;
        int maxMoves = 100;

        intro();

        while (!myMap.didIWin() && moves <= maxMoves) {
            direction = userMove();
            System.out.println(direction); //This is just a verification to make sure a String is being returned from method.

            if (direction.equals("R") && myMap.canIMoveRight() && !myMap.isThereAPit(direction)) {
                myMap.moveRight();
                myMap.printMap();
                System.out.print("Fila: " + myMap.getRow() + " Columna: " + myMap.getCol() + " Moves: " + moves);
            } else if (direction.equals("U") && myMap.canIMoveUp() && !myMap.isThereAPit(direction)) {
                myMap.moveUp();
                myMap.printMap();
                System.out.print("Fila: " + myMap.getRow() + " Columna: " + myMap.getCol() + " Moves: " + moves);
            } else if (direction.equals("L") && myMap.canIMoveLeft() && !myMap.isThereAPit(direction)) {
                myMap.moveLeft();
                myMap.printMap();
                System.out.print("Fila: " + myMap.getRow() + " Columna: " + myMap.getCol() + " Moves: " + moves);
            } else if (direction.equals("D") && myMap.canIMoveDown() && !myMap.isThereAPit(direction)) {
                myMap.moveDown();
                myMap.printMap();
                System.out.print("Fila: " + myMap.getRow() + " Columna: " + myMap.getCol() + " Moves: " + moves);
            } else if (myMap.isThereAPit(direction)){
                System.out.print("Watch out! There's a pit ahead, jump it? (\"yes\" or \"no\")");
                String jump = input.next();

                if (jump.substring(0, 1).toLowerCase().equals("y")) {
                    myMap.jumpOverPit(direction);
                    myMap.printMap();
                } else {
                    System.out.println();
                }
            } else {
                System.out.println("Sorry, you've hit a wall");
                System.out.println("Fila " + myMap.getRow() + " Columna " + myMap.getCol() + " Moves: " + moves);
            }
            movesMessage(moves);
            moves++;
        }

        if (moves <= maxMoves) {
            System.out.println("\nCongratulations, you made it out alive! and you did it in " + moves + "moves.");
        } else {
            System.out.println("\nSorry, you didn't escape in time- you lose!");
        }

    }

    public static void intro() {
        System.out.println("Welcome to Maze Runner!");
        System.out.println("You have a hundred moves to get out. :O");
        System.out.println("Here is your current position: ");
        Maze myMap = new Maze();
        myMap.printMap();
    }

    public static String userMove() {
        Scanner input = new Scanner(System.in);
        String direction;

        System.out.println("\n");
        System.out.print("\nWhere would you like to move? (R, L, U, D) ");
        direction = input.next().toUpperCase();

        while (!direction.matches("[RLUD]")) {
            System.out.println("\nUse a valid letter! Consider Upper Casing.");
            System.out.print("Where would you like to move? (R, L, U, D) ");
            direction = input.next().toUpperCase();
        }
        return direction;
    }

    public static void movesMessage(int moves) {
        if (moves == 50) {
            System.out.println("\nWARNING: You have made 50 moves. You have 50 remaining before the maze exit closes.");
        } else if (moves == 75) {
            System.out.println("\nAlert! You have made 75 moves, you only have 25 moves left to escape.");
        } else if (moves == 90) {
            System.out.println("\nDANGER! You have made 90 moves, you only have 10 moves left to escape!!");
        } else if (moves == 100) {
            System.out.println("\nOh, no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
        }
    }

}
