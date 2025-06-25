import java.util.*;
public class switchstmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 4 to select a drink:");
        int num = sc.nextInt();
        sc.close();
        switch (num) {
            case 1:
            System.out.println("Pepsi");
            break;
            case 2:
            System.out.println("Coke");
            break;
            case 3:
            System.out.println("Sprite");
            break;
            case 4:
            System.out.println("Fanta");
            break;
            default:
            System.out.println("Invalid choice, please select a number between 1 and 4.");
        }
    }
}
