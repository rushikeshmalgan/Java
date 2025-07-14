public class swapTwo {
    public static void swap(int a, int b) {
        System.out.println("before swap : a = " + a + ", b = " + b);
        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swap : a = " + a + ", b = " + b);

    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);
        // Swapping without using a temporary variable
        a = a + b; // a now becomes 15
        b = a - b; // b becomes 5 (15 - 10)
        a = a - b; // a becomes 10 (15 - 5) 
        System.out.println("after swap without temp : a = " + a + ", b = " + b);
    }
}
