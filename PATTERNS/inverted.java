public class inverted {
    public static void main(String[] args) {
        int n =4;
        for(int i =1; i<=4; i++) {
            for (int stars =1; stars<=n-i+1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
