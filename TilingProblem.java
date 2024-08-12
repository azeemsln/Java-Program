import java.util.Scanner;

// GIven the area of the wall in 2*n find The way to stick the tiles which dimension is 2*1.
public class TilingProblem {
    public static int wayOfTiling(int n) {

        if (n <= 3) {
            return n;
        } else {
            return wayOfTiling(n - 1) + wayOfTiling(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(wayOfTiling(n));
        
    }
}
