public class charPattern {
    public static void main(String[] args) {
        int n = 4; 
        for (int i =1; i<=n; i++){
            for (int j =1; j<=i; j++){
                char ch = (char)('A' + j - 1); // Convert to character
                System.out.print(ch);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
