import java.util.Scanner;
public class printNNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i = 0;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        sc.close();
        
        
    }
    
}
