import java.util.*;
public class incomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual income: ");
        double income = sc.nextDouble();
        sc.close();
        double tax;
        if (income <= 250000) {
            tax = 0;
            System.out.println("No tax applicable for income up to 2.5 lakhs.");
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.05; // 5% tax for income between 2.5 lakhs and 5 lakhs
            System.out.println("Tax for income between 2.5 lakhs and 5 lakhs: " + tax);
        } else if (income <= 1000000) {
            tax = (250000 * 0.05) + ((income - 500000) * 0.1); // 10% tax for income between 5 lakhs and 10 lakhs
            System.out.println("Tax for income between 5 lakhs and 10 lakhs: " + tax);
        } else {
            tax = (250000 * 0.05) + (500000 * 0.1) + ((income - 1000000) * 0.3); // 30% tax for income above 10 lakhs
            System.out.println("Tax for income above 10 lakhs: " + tax);
        }
    }
}
