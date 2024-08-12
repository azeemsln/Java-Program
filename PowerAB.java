import java.math.BigInteger;
import java.util.*;
public class PowerAB {
   public static int powerAB(int n,int m){
    if(m==0){
        return 1;
    }
        if(m==1){
            return n;
        }
        return n*powerAB(n, m-1);
    }

    public static BigInteger power(BigInteger a,int b){
        BigInteger result,finalresult;
        if(b==1){
            return a;
        }
        else{
            result=power(a,b/2);
            finalresult=result.multiply(result);
            if(b%2==0){
                return finalresult;
            }
            else{
                return a.multiply(finalresult);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter two number.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger a=sc.nextBigInteger();
        int m=sc.nextInt();
        System.out.println(powerAB(n,m));
        System.out.println(power(a,m));
    }
}
