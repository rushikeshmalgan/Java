import java.util.*;
public class charPattern2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        char ch = 'A';
        for (int i =1; i<=n; i++) {
            for (int j =1; j<=i; j++){
                System.out.print(ch);
                ch++; // Increment character to get the next letter
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
