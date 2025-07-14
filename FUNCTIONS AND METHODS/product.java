public class product {
    public static int product (int a, int b) {
        System.out.println("Calculating product of " + a + " and " + b);
        return a * b;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        int result = product(a, b);
        System.out.println("The product of " + a + " and " + b + " is: " + result);
    }
}
