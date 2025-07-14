public class DecToBin {
    public static void DecToBin(int DecNum){
        int pov = 0;
        int binNum = 0;

        while (DecNum > 0) {
            int rem = DecNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pov));
            pov++;
            DecNum /= 2;
        }
        System.out.println("Binary equivalent: " + binNum);
    }
    public static void main(String[] args) {
        DecToBin(664); // Example decimal number
    }
}
