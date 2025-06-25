package BASICS;
import java.util.*; // Import the Scanner class for input

public class sumInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        System.out.println("Please enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Please enter the second number: ");
        int b = sc.nextInt();
        int sum = a + b; // Calculate the sum of the two numbers
        System.out.println("The sum of " + a + " and " + b + " is: " + sum); // Print the sum
        System.out.println("Thank you for using the sum calculator!"); // Acknowledgment message
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
