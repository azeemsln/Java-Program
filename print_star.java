import java.util.Scanner;

public class print_star {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        sc.close();
    }

}
