import java.util.Scanner;

public class factorial {
    public static int fact(int a) {
        int j = a;
        if (a != 0) {
            for (int i = a; i > 1; i--) {
                j = j * (i - 1);
            }
            return j;
        } else {
            return 1;
        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = sc.nextInt();
        int b = fact(a);
        System.out.println("The factorial of " + a + " is " + b);
        sc.close();
    }

}
