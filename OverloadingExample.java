public class OverloadingExample {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a.concat(b);
    }

    public static void main(String[] args) {
        int sum1 = add(2, 3);
        System.out.println("Sum of integers: " + sum1);

        double sum2 = add(2.5, 3.7);
        System.out.println("Sum of doubles: " + sum2);

        String result = add("Hello", " World!");
        System.out.println("Concatenated string: " + result);
    }
}
