import java.util.*;

public class Print1ToN {
    public static void Nto1(int n){
        System.out.println(n);
        if(n>1){
            Nto1(n-1);
        }
    }

    public static void onetoN(int n){
        if(n==0){
            return;
        }
        onetoN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        System.out.println("Enter a number.");
        int n=m.nextInt();
        Nto1(n);
        onetoN(n);
    }
}
