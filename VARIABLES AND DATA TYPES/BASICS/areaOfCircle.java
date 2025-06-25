package BASICS;
import java.util.*; // Import the Scanner class for input

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in); // Create a Scanner object for input   
        System.out.println("Please enter the radius of the circle: ");
        double radius = a.nextDouble(); // Read the radius of the circle
        double area = Math.PI * radius * radius; // Calculate the area of the circle using the formula πr²
        System.out.println("The area of the circle with radius " + radius + " is: " + area); // Print the area
        System.out.println("Thank you for using the circle area calculator!"); // Acknowledgment message
        a.close(); // Close the scanner to prevent resource leaks
        
    }
}
