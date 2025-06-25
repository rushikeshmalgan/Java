package BASICS;
import java.util.*; // Import the Scanner class for input 

public class inout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        System.out.println("Please enter your input: ");
        String input = sc.nextLine();
        System.out.println("You entered: " + input); // Print the input received from the user  
        System.out.println("Thank you for your input!"); // Acknowledgment message
        sc.close(); // Close the scanner to prevent resource leaks

    }
    
}
