// public class factorial {
//     public static int factorial (int n) {
//         if (n == 0) {
//             return 1;
//         } else {
//             return n * factorial(n - 1);
//         }
//     }
//     public static void main(String[] args) {
//         int num = 5;
//         int result = factorial(num);
//         System.out.println("The factorial of " + num + " is: " + result);
//     }
// } 



public class factorial {
    public static int factorial (int n) {
        int f=1;
        
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        int num = 8;
        int result = factorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }
}