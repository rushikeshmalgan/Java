import java.util.*;
public class funcSc {
    public static void printHelloWorld() {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");

        System.out.println("Hello, World!");

        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        // return;

    }


    // public static void caclSum(int a, int b) {
    //     int sum = a + b;
    //     System.out.println("Sum is: " + sum);
    // }

    public static int caclSum(int a, int b) { // parameters
            int sum = a + b;
            System.out.println("Sum is: " + sum);
            return sum;
        }



//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         caclSum(a,b);
//     }
// }

public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = caclSum(a,b); // arguments
    }
}