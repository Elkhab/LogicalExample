public class CountExample {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                a++;
//                System.out.println("Число i содержит " + a + " - четных ");
            } else {
                b = b + 1;
            }
//            System.out.println(" Число i содержит " + b + " - нечетных ");
        }

        System.out.println("  " + a + " - четных ");
        System.out.println("   " + b + " - нечетных ");

    }
}

