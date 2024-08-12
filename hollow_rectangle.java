import java.util.Scanner;

public class hollow_rectangle {
    public static void hollow(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int row) {
        int count = 1;
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(count + " ");
                count++;
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows.");
        int row = sc.nextInt();
        System.out.println("Enter number of column.");
        int col = sc.nextInt();
        hollow(row, col);
        inverted_half_pyramid(row, col);
        System.out.println();
        floyd_triangle(row);
        sc.close();
    }
}