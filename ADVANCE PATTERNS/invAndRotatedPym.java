public class invAndRotatedPym {
    public static void inv_rot_pym(int n) {
        for ( int i=1; i <= n; i++ ) {
            for ( int j = 1; j <= n-i; j++ ) {
                System.out.print(" ");
            }
            for ( int j = 1; j <= i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inv_rot_pym(5); // Example call, you can change the value of n
    }
}
