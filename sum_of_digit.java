import java.util.Scanner;

public class sum_of_digit {
    public static void sum(int a) {
        int digit = 0, num = a;
        while (a > 0) {
            digit = digit + (a % 10);
            a = a / 10;
        }
        System.out.println("The sum of the digit of the number of " + num + " is " + digit);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number.");
        int a = sc.nextInt();
        sum(a);
        sc.close();
    }
}
