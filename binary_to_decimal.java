import java.util.Scanner;

public class binary_to_decimal {
    public static void bintodec(int a) {
        int pow = 0, dec = 0;
        int b = 0;
        b = a;
        while (b > 0) {
            int ld = b % 10;
            dec = dec + (ld * (int) Math.pow(2, pow));
            pow++;
            b = b / 10;
        }
        System.out.println("The decimal of " + a + " is " + dec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number.");
        int a = sc.nextInt();
        bintodec(a);
        sc.close();
    }
}
