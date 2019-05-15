public class Module02Test {
    public static void main(String[] args) {
        pyramid();
    }

    public static void pyramid() {
        int contador = 1;
        int limit = 11;
        int guiones = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= limit; j++) {
                if (j == limit / 2 + 1) {
                    System.out.print(contador);
                    contador  += 2;
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }


}
