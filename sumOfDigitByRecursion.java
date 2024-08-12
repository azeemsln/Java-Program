import java.util.*;

public class sumOfDigitByRecursion {
    public static int sumDigit(int n){

        if(n==0){
            return 0;
        }
        else{
            return n%10+sumDigit(n/10);
        }


    }
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        System.out.println("Enter a number.");
        int n=m.nextInt();
        System.out.println(sumDigit(n));
    }
}
