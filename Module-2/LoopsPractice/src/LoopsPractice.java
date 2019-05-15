public class LoopsPractice {
    public static void main(String[] args) {
        //loopFor01();
        //loopFor02();
        //loopFor03();
        loopFor04();
    }

    public static void loopFor01(){
        int number = 4;
        for (int i = 1; i <= number; i++) { //I have didn't notice that in this case, the variable "number"
            // also changes with the loop!
            System.out.println(number);
            number = number/2;
        }
    }

    public static void loopFor02() {
        int total = 25;
        for (int number = 1; number <= (total/2); number++) { //Here there should be taken into account that the total in the
            //boolean test updates as the code below change it as it iterate. Hence, the output.
            total = total - number;
            System.out.println(total + " " + number);
        }
    }

    public static void loopFor03(){
        for (int i = 1; i <= 3; i++)     //If on a For Loop there are not curly braces, the sentence ends at the first ";". Hence
            //it will reapet the "How many lines" 3 times and after that, the "are printed?"
            System.out.println("How many lines");
            System.out.println("are printed?");

    }

    public static void loopFor04() {
        for (int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10 - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
