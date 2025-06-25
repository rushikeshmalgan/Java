public class ternary {
    public static void main(String[] args) {
        // Example for checking the largest of three numbers using ternary operator
        int a = 10;
        int b = 20;
        int c = 15;

        String result = (a > b && a > c) ? "A is the largest number" :
                        (b > a && b > c) ? "B is the largest number" :
                        (c > a && c > b) ? "C is the largest number" :
                        "There is no single largest number, some numbers are equal";

        System.out.println(result);


        int x = 5;
        int y = 6;
        int z = 7;
        String result2 = (x > y || x > z) ? "X is one of the largest number" :
                          (y > x || y > z) ? "Y is one of the largest number" :
                          (z > x || z > y) ? "Z is one of the largest number" :
                          "There is no single largest number, some numbers are equal";
        System.out.println(result2);
    }
}
