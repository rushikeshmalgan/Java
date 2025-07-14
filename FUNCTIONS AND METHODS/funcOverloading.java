public class funcOverloading {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        int intResult = add(5, 10);
        int intResult2 = add(3, 7); // Example of another integer addition
        double doubleResult = add(5.8, 10.5);
        String stringResult = add("Hello, ", "world!");

        System.out.println("Integer addition: " + intResult);
        System.out.println("Double addition: " + doubleResult);
        System.out.println("String addition: " + stringResult);
        System.out.println("Another Integer addition: " + intResult2);
    }
}
