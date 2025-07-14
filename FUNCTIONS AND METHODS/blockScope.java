public class blockScope {
    public static void main(String[] args) {
        int x = 10; // Variable x is defined in the main method scope
        System.out.println("Value of x in main: " + x);
        
        // Demonstrating block scope
        if (x > 5) {
            int y = 20; // y is defined within this block
            System.out.println("Value of y in if block: " + y);
        }
        
        // Uncommenting the next line would cause a compilation error because y is not accessible here
        // System.out.println("Trying to access y outside its block: " + y);
    }
}
