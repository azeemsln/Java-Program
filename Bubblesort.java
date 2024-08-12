import java.util.Arrays;

public class Bubblesort {
    public static void bubbleSort(int number[]) {
        for (int j = 0; j < number.length; j++) {
            for (int i = 0; i < number.length - j - 1; i++) {
                if (number[i] > number[i + 1]) {
                    int temp = number[i];
                    number[i] = number[i + 1];
                    number[i + 1] = temp;
                }
            }

        }
        // for (int i = 0; i < number.length; i++) {
        // System.out.print(number[i] + " ");
        // }
    }

    public static void main(String[] args) {
        int number[] = { 23, 43, 12, 87, 54, 67, 2, 8 };
        bubbleSort(number);
        System.out.println(Arrays.toString(number));
    }
}
