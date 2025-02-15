import java.util.Scanner;

public class _17_binary_to_decimal {
    public static int Bi_to_deci(int binum) {

        int pow = 0;
        int decimal = 0;
        while (binum > 0) {
            int lastdigit = binum % 10;
            decimal = decimal + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            binum = binum / 10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        System.out.println("Enter the value of binary number:");
        int x = M.nextInt();
        int deciamlNumber = Bi_to_deci(x);
        System.out.println("your  "+x+ " to decimal is "+deciamlNumber );
    }
}
