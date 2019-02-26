public class LogaicalOperators {


    public static void main(String[] args) {
        double a = 18;
        double b = 19;
        int c = 20;
        double d = Math.abs(c - a);
        double f = Math.abs(c - b);
        if (d == f) {
            System.out.println("Числа " + a + " и " + b + " равноудалены от " + c);
        }
        if (b > c) {
            System.out.println("Число " + a + " ближе к " + c);
        }
        if (b < c) {
            System.out.println("Число " + b + " ближе к " + c);
        }
    }
}



