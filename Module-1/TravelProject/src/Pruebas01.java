import java.util.Scanner;

public class Pruebas01 {
    public static void main(String[] args) {
        //Prueba001();
        //Prueba002();
        //Prueba003();
        Prueba004();
    }

    public static void Prueba001() {
        Scanner input = new Scanner(System.in);
        int dividendo = input.nextInt();
        int divisor = input.nextInt();
        double cociente = (double)dividendo / divisor * 100;
        int cociente2 = (int)cociente;
        double cociente3 = (double)cociente2/100;
        double defini = (double)((int)((double)dividendo / divisor * 100))/100;

        System.out.println("The numer is "+cociente);
        System.out.println("The number is " + cociente2);
        System.out.println("The number is " + cociente3);
        System.out.println(("The fini is "+defini));
    }

    public static void Prueba002() {
        double number1 = Math.sin(0);
        double number2 = Math.cos(0);
        double number3 = Math.asin(0);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }

    public static void Prueba003(){
        System.out.println("\nNow, lets calculate the distance from your home to your travel destination!");
        Scanner input = new Scanner(System.in);
        System.out.print("Give me the longitude of your home: ");
        double longt1 = input.nextDouble();
        System.out.print("Give me the latitude of your home: ");
        double latit1 = input.nextDouble();
        System.out.print("Give me the longitude of your destination: ");
        double longt2 = input.nextDouble();
        System.out.print("Give me the latitude of your destination: ");
        double latit2 = input.nextDouble();
        double res01 = Math.pow(Math.sin((latit2-latit1)/2),2);
        double res02 = Math.cos(latit1)*Math.cos(latit2);
        double res03 = Math.pow(Math.sin((longt2-longt1)/2),2);
        double res04 = 2*(6367.44)*Math.asin(Math.sqrt(res01+res02*res03));
        System.out.println(res01);
        System.out.println(res02);
        System.out.println(res03);
        System.out.println(res04);
        double res = 2*(6367.44)*Math.asin(Math.sqrt(Math.pow( Math.sin((latit2-latit1)/2),2)+Math.cos(latit1)*Math.cos(latit2)*Math.pow(Math.sin((longt2-longt1)/2),2)));
        System.out.println("\n"+res);
    }

    public static void Prueba004() {

    }

}
