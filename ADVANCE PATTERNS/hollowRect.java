public class hollowRect {
    public static void main(String[] args) {
        hollowRect(4, 5); // Example call, you can change the values
    }

    public static void hollowRect(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}