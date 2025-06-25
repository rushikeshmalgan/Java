import java.util.*;
public class LorW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your makrs:");
        int marks = sc.nextInt();
        sc.close();
        String reportCard = marks >=40 ? "You have passed the exam" : "You have failed the exam";
        System.out.println(reportCard); 
        // Using if-else statement
        if (marks >= 40) {
            System.out.println("You have passed the exam");
        } else {
            System.out.println("You have failed the exam");
        }
    }
}
