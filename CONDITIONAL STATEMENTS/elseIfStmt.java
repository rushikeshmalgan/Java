public class elseIfStmt {
    public static void main(String[] args) {
        // Example for checking the largest of three numbers
        int a = 10;
        int b = 20;
        int c = 15;

        if (a > b && a > c) {
            System.out.println("A is the largest number");
        } else if (b > a && b > c) {
            System.out.println("B is the largest number");
        } else if (c > a && c > b) {
            System.out.println("C is the largest number");
        } else {
            System.out.println("There is no single largest number, some numbers are equal");
        }
    }
}
