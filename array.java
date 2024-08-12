import java.util.Scanner;

public class array {
    public static void linear_search(int numbers[]) {
        int a = numbers.length;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search.");
        int key = sc.nextInt();
        
        for (i = 0; i < a; i++) {
            if (numbers[i] == key) {
                System.out.println("The index of " + key + " in the array is " + i);
                break;
            }
        }

        if (i == a) {
            System.out.println("The number " + key + " is not present in the array.");
        }

    }

    public static void largest_number(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        System.out.println("The largest value in the array is " + largest);
    }

    public static void binary_search(int numbers[]) {
        int start = 0, end = numbers.length - 1; // Corrected end index
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search.");
        int key = sc.nextInt();
        while (start <= end) { // Corrected condition
            int mid = (start + end) / 2;
            // comparison
            if (numbers[mid] == key) {
                System.out.println("The index of " + key + " is " + mid);
                return;
            } else if (numbers[mid] < key) {
                start = mid + 1; // right
            } else {
                end = mid - 1;
            }
        }
        System.out.println("The number " + key + " is not present in the array.");

    }

    public static void reverse(int num[]) {
        int first = 0, last = num.length - 1;
        while (first < last) {
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;
            first++;
            last--;
        }
        System.out.println("Reversed array:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println(); // Print newline after reversed array
        
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 13, 6, 8, 16, 10, 12, 14 };
        int num[] = { 2, 4, 6, 8, 10, 11, 12, 14, 16, 18, 20, 22 };
        linear_search(numbers);
        largest_number(numbers);
        binary_search(num);
        largest_number(num);
        reverse(num);
    }
}
