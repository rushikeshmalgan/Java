import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        boolean isPrime = true;

        for (int i =2; i<=n-1; i++) {
            if (n % i == 0) { //n is a multiple of i where i is not 1 or n
                isPrime = false;
                break;
            }
        }
        if (isPrime == true) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
