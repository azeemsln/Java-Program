import java.util.Scanner;

public class liner_search {
    public static void linear_S(int number[], int num) {
        int i;
        for (i = 0; i < number.length; i++) {
            if (number[i] == num) {
                System.out.println("index of " + num + " is " + i);
                break;
            }
        }
        if (i == number.length) {
            System.out.println("This number is not present.");
        }
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search.");
        int num = sc.nextInt();
        linear_S(number, num);
        sc.close();
    }
}
