import java.util.*;
public class sumOfNos{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= n) {
            sum +=i;
            i++;
        }
        System.out.println("sum is " + sum);
        scan.close();
    }
}