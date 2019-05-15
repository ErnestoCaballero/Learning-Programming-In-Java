public class Tests01 {
    public static void main(String[] args) {
        //double resp = pow2(2, -5);
        //System.out.println(resp);
        //power2();
        getGrade();
    }

    public static double pow2(double base, int exp) {
        double res = 1.0;

        if (exp == 0) {
            return res;
        } else if (exp > 0) {
            for (int i = 1; i <= exp; i++) {
                res = base * res;
            }
            return res;
        } else if (exp < 0){
            for (int i = 1; i <= exp; i++) {
                res = res * (1.0 / base);
            }
            return res;
        } else {
            return 401.12;
        }
    }

    public static void power2() {
        double res = 1.0;
        int exp = -3;
        double base = 2;

        if (exp == 0) {
            System.out.println(1);
        } else if (exp > 0) {
            for (int i = 1; i <= exp; i++) {
                res = base * res;
                System.out.println(res);
            }
        } else {
            for (int i = exp; i < 0; i++) {
                res = res * (1.0 / base);
                System.out.println(res);
            }
        }
    }

    public static void getGrade() {
        int grade = 101;
        double gpa = 0;


        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade should be greater than 0 or maximum 100.");
        } else if (grade < 60) {
            System.out.println(gpa);
        } else if (grade >= 60 && grade <= 62) {
            gpa = 0.7;
            System.out.println(gpa);
        } else if (grade <= 94) {
            gpa = 0.8 + (0.1 * (grade - 63));
            System.out.println(gpa);
        } else {
            gpa = 4.0;
            System.out.println(gpa);
        }
    }
}
