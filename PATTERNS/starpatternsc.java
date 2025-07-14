import java.util.Scanner;
public class starpatternsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no. of lines: ");
        int line = sc.nextInt();
        for(int i = 1; i<=line; i++){
            for (int stars= 1; stars<=i; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
