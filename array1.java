// import java.util.*;
public class array1 {
    public static int largestnum(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static int trappin_water(int number[]) {
        int leftmax[] = new int[number.length];
        leftmax[0] = number[0];
        for (int i = 1; i < number.length; i++) {
            leftmax[i] = Math.max(number[i], leftmax[i - 1]);
        }
        int rightmax[] = new int[number.length];
        rightmax[number.length - 1] = number[number.length - 1];
        for (int i = number.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(number[i], rightmax[i + 1]);
        }
        int trapwater = 0;
        for (int i = 0; i < number.length; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapwater += waterlevel - number[i];
        }
        return trapwater;
    }

    public static void main(String[] args) {
        int num[] = { 45, 14, 78, 36, 15, 47 };
        System.out.println("Largest value is " + largestnum(num));
        int number[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Trapping water for the given height is " + trappin_water(number));

    }
}
