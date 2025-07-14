public class BinaryToDecimal {
    public static void BinaryToDecimal (int binNum){
        int pow = 0;
        int decNum = 0;
         
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum += lastDigit * Math.pow(2, pow);
            pow++;
            binNum /= 10;
        }
        System.out.println("Decimal equivalent: " + decNum);
    }
    public static void main(String[] args) {
        BinaryToDecimal(111); 
    }
}
