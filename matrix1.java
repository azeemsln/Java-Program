import java.util.*;

public class matrix1 {
    public static void printmatrix(int matrix[][]) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int diagonalSum(int matrix[][]) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (m == n) {
            int sum1 = 0;
            int sum2 = 0;

            for (int i = 0; i < m; i++) {
                // pd
                sum1 += matrix[i][i];
                // sd
                if (i != n - 1 - i)
                    sum2 += matrix[i][n - 1 - i];
            }
            return sum1 + sum2;
        } else {
            System.out.println("This is not an square matrix so there is no diagonal elemnent.");
            return 0;
        }
    }

    public static void main(String[] args) {
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
        sc.close();
        printmatrix(matrix);
        System.out.println("The diagonal sum of the matrix you entered is " + diagonalSum(matrix));

    }
}
