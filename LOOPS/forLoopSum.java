import java.util.Scanner;
public class forLoopSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        int sum = 0;
        
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("Sum is " + sum);
        scan.close();
    }
}
