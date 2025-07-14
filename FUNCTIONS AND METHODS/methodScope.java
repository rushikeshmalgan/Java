public class methodScope {
    public static void main(String[] args) {
        int x = 10; // Variable x is defined in the main method scope
        System.out.println("Value of x in main: " + x);
        
        // Calling the method to demonstrate variable scope
        printX();
    }

    public static void printX() {
        int x = 20; // This x is different from the one in main
        System.out.println("Value of x in printX: " + x);
    }
}
