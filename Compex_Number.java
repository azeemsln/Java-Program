import java.util.*;

public class Compex_Number {
    public static void main(String[] args) {
        Complex obj = new Complex();
        obj.sum();
    }
}

class Complex {
    void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of a complex number.");
        int a = sc.nextInt();
        System.out.println("Enter imaginary part of a complex number.");
        int b = sc.nextInt();
        System.out.println(a + "i +" + b);
        System.out.println("Enter real part of another complex number.");
        int c = sc.nextInt();
        System.out.println("Enter imaginary part of another complex number.");
        int d = sc.nextInt();
        System.out.println(c + "i +" + d);
        System.out.println((a + c) + "i " + (b + d));
        sc.close();
    }

    void diference() {

    }

    void product() {

    }
}
