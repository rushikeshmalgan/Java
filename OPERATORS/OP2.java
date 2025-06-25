public class OP2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("divide = " + (a / b));
        System.out.println("divide = " + (b / a));

        int A = 10;
        int B = 20; 
        System.out.println("multi = " + (A * B));  
        System.out.println("divide = " + (B / A));

        int x = 10;
        int y = 20;
        System.out.println("add = " + (x + y));
        System.out.println("sub = " + (y - x));
        System.out.println("multi = " + (x * y));
        System.out.println("divide = " + (y / x));
        System.out.println("mod = " + (y % x));
        System.out.println("add = " + (y + x));
        System.out.println("sub = " + (x - y));
        System.out.println("multi = " + (x * y));

        // Additional operations
        System.out.println("increment = " + (++x)); // Pre-increment
        System.out.println("decrement = " + (--y)); // Pre-decrement
        System.out.println("post-increment = " + (x++)); // Post-increment
        System.out.println("post-decrement = " + (y--)); // Post-decrement
        System.out.println("final x = " + x); // Final value of x after post-increment
        System.out.println("final y = " + y); // Final value of y after post-decrement
        System.out.println("negation = " + (-x)); // Negation of x
        System.out.println("negation = " + (-y)); // Negation of y
        System.out.println("bitwise AND = " + (x & y)); // Bitwise AND
        System.out.println("bitwise OR = " + (x | y)); // Bitwise OR
        System.out.println("bitwise XOR = " + (x ^ y)); // Bitwise XOR
        System.out.println("left shift = " + (x << 1)); // Left shift
        System.out.println("right shift = " + (y >> 1)); // Right shift
        System.out.println("unsigned right shift = " + (y >>> 1)); // Unsigned right shift
        System.out.println("logical AND = " + (a > 5 && b < 30)); // Logical AND    
        System.out.println("logical OR = " + (a < 5 || b > 15)); // Logical OR
        System.out.println("logical NOT = " + !(a < 5)); // Logical NOT
        System.out.println("ternary operator = " + (a > b ? "a is greater" : "b is greater")); // Ternary operator
        System.out.println("string concatenation = " + ("Hello " + "World")); // String concatenation
        System.out.println("string length = " + ("Hello World".length())); // String length
        System.out.println("string to upper case = " + ("Hello World".toUpperCase())); // String to upper case
        System.out.println("string to lower case = " + ("Hello World".toLowerCase())); // String to lower case
        System.out.println("substring = " + ("Hello World".substring(0, 5))); // Substring
        System.out.println("char at = " + ("Hello World".charAt(0))); // Character at index
        System.out.println("index of = " + ("Hello World".indexOf('o'))); // Index of character     
        System.out.println("replace = " + ("Hello World".replace('o', 'a'))); // Replace character
        System.out.println("trim = " + ("   Hello World   ".trim())); // Trim whitespace
        System.out.println("equals = " + ("Hello".equals("Hello"))); // String equals
    }
}
