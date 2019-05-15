/*
    This project was made by Ernesto on february 24, 2019.
 */

public class VariablesDemo {
    public static final int SILLAS_HABITACION = 15;  //Class CONSTANT for the file to use in all methods.

    public static void main(String[] args){
        methodOne();
        methodTwo();
    }

    public static void methodOne(){
        int x = 25 + 4 / 2;
        String hola = "El número es: ";
        System.out.println(hola + x);
        System.out.println("Hay " + SILLAS_HABITACION + " sillas en la habitación.\n");
    }

    public static void methodTwo() {
        double z = 0;
        double y = 5.5;
        methodOne();
        int x = 5;
        z = x + y;
        System.out.println("El número dos es: " + z);
    }
}
