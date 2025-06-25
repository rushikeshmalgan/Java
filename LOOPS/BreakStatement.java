public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i equals 5
            }
            System.out.println(i); // This will print numbers from 0 to 4
        }
        
        System.out.println("Loop has been exited.");
    }
}
