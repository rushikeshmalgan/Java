package BASICS;
import java.util.*; // Import the Scanner class for input

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        System.out.println("Please enter the first number: ");
        int a = sc.nextInt(); // Read the first number
        System.out.println("Please enter the second number: ");
        int b = sc.nextInt(); // Read the second number
        int product = a * b; // Calculate the product of the two numbers
        System.out.println("The product of " + a + " and " + b + " is: " + product); // Print the product
        System.out.println("Thank you for using the product calculator!"); // Acknowledgment message
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
