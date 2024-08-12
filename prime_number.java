import java.util.Scanner;

public class prime_number {
    public static boolean isPrime(int a) {
        if (a == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeinrange(int a) {
        for (int i = 2; i <= a; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int a = sc.nextInt();
        // System.out.println(isPrime(a));
        System.out.println("prime number upto " + a + " is ");
        primeinrange(a);
        sc.close();
    }
}
