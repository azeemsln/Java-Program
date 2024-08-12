import java.util.*;

public class array_2d {
    public static void create_matrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows.");
        int m = sc.nextInt();
        System.out.println("Enter number of columns.");
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        System.out.println("Enter elements of matrix.");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void spiral_output() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows.");
        int m = sc.nextInt();
        System.out.println("Enter number of columns.");
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        System.out.println("Enter elements of matrix.");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int startrow = 0;
        int endrow = m - 1;
        int startcol = 0;
        int endcol = n - 1;
        while (startrow <= endrow && startcol <= endcol) {

            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");

            }
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) {
                    break;
                }

                System.out.print(matrix[endrow][j] + " ");
            }
            for (int i = endrow - 1; i > startrow; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");

            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        System.err.println();
        sc.close();
    }

    public static void main(String[] args) {

        // create_matrix();
        spiral_output();
    }
}
