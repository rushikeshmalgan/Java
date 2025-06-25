package BASICS;
import java.util.*; // Import the Scanner class for input
public class typePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)(a));
        System.out.println((int)b);
        System.out.println(b-a); // This will print the difference between the ASCII values of 'b' and 'a'  




        short c = 10;
        short d = 20;   
        // short e = c + d; // This will cause a compile-time error due to type promotion
        int e = c + d; // Corrected: Use int to store the result of the addition        
        System.out.println("The sum of c and d is: " + e); // Print the result of the addition
        // Note: In Java, when performing arithmetic operations, the operands are promoted to int if they are of type byte, short, or char.
        // This is why we need to store the result in an int variable.
        // Example of type promotion in arithmetic operations
        byte x = 10;
        byte y = 20;
        int z = x + y; // Type promotion occurs here, as byte is promoted to int
        System.out.println("The sum of x and y is: " + z); // Print the result of the addition
        // Example of type promotion in arithmetic operations with float
        float f1 = 10.5f;
        float f2 = 20.5f;
        float f3 = f1 + f2; // Type promotion occurs here, as float is promoted to float
        System.out.println("The sum of f1 and f2 is: " + f3); // Print the result of the addition
        // Example of type promotion in arithmetic operations with double
        double d1 = 10.5;
        double d2 = 20.5;
        double d3 = d1 + d2; // Type promotion occurs here, as double is promoted to double
        System.out.println("The sum of d1 and d2 is: " + d3); // Print the result of the addition
        // Example of type promotion in arithmetic operations with mixed types
        int i1 = 10;
        double d4 = 20.5;
        double d5 = i1 + d4; // Type promotion occurs here, as int is promoted to double
        System.out.println("The sum of i1 and d4 is: " + d5); // Print the result of the addition
        // Example of type promotion in arithmetic operations with mixed types
        long l1 = 100L;
        float f4 = 20.5f;
        float f5 = l1 + f4; // Type promotion occurs here, as long is promoted to float
        System.out.println("The sum of l1 and f4 is: " + f5); // Print the result of the addition
    }
}
