import java.util.Scanner;

public class area_of_circle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float a = sc.nextFloat();
        double area = 3.14 * a * a;
        System.out.println("The area of circle is  " + area);

        sc.close();
    }

}
