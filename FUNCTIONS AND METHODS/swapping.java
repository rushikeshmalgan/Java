public class swapping {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
        // Swapping without using a temporary variable
        a = a + b; // a now becomes 15
        b = a - b; // b becomes 5 (15 - 10)
        a = a - b; // a becomes 10 (15 - 5)
        System.out.println("After swapping without temp: a = " + a + ", b = " + b);
        // Swapping using bitwise XOR   
    }
}
