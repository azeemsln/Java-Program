import java.util.*;

public class BinarySearch {
    public static void binarySearch(int []number,int n){
        int left=0;
        int right=number.length-1;
        int idx=-1;
        while(left<=right){
            int mid=(left+(right-left)/2);

            if(n==number[mid]){
                System.out.println(n +" is at "+mid + " index.");
                idx=1;
                break;
            }
            else if(n<number[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        if(idx==-1){
            System.out.println("The number is not present in the array.");
        }
    }
    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search.");
        int n = sc.nextInt();
        binarySearch(number,n);
    }

}
