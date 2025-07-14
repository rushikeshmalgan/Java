public class binomialCoeff {
    public static int BC ( int a ,int b) {
        return factorial(a) / (factorial(b) * factorial(a - b));
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int result = BC(n, k);
        System.out.println("The binomial coefficient C(" + n + ", " + k + ") is: " + result);
    
    }
}
