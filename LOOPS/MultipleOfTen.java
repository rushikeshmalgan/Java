import java.util.Scanner;
public class MultipleOfTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your number: ");
            int i = sc.nextInt();
            if (i%10 ==0) {
                break;
            }
            System.out.println("Not a multiple of 10, try again.");
        } while (true);
    }
    
}
