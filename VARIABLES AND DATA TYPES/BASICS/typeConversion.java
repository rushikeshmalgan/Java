package BASICS;
 import java.util.*; // Import the Scanner class for input
public class typeConversion {
    public static void main(String[] args) {
        float a = 35.6f;
        int  b = (int) a; // Explicitly convert float to int
        System.out.println("The float value is: " + a); // Print the float value
        char c = 'A';
        int d = (int) c; // Explicitly convert char to int
        System.out.println("The char value is: " + c); // Print the char value

        char c2 = 'B';
        int num = c2; // Implicitly convert char to int
        System.out.println("The ASCII value of char " + c2 + " is: " + num); // Print the ASCII value of the char
        String str = "123";
        int num2 = Integer.parseInt(str); // Convert String to int using parseInt
    }
}
