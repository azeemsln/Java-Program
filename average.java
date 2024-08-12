import java.util.Scanner;

public class average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        float avg = (float) sum / 3;
        System.out.print("AVerage of three numbers is : " + avg);
        sc.close();
    }
}
