public class primesInARanfge {
    public static void primesInARanfge (int n) {
        for (int i = 2; i<=n ; i ++  ){
            if(isPrime(i)) {
                System.out.println(i+" ");

            }

        }
        System.out.println();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        primesInARanfge(100);
    }
}
