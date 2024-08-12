import java.util.Scanner;

public class decimal_to_binary {
    public static void decitobin(int a) {
        int bi = 0, rem, pow = 0;
        while (a > 0) {
            rem = a % 2;
            bi = bi + rem * (int) Math.pow(10, pow);
            pow++;
            a = a / 2;
        }
        System.out.print("The binary form of this number is " + bi);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int a = sc.nextInt();
        decitobin(a);
        sc.close();
    }
}
