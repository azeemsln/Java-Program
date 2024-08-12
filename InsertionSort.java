import java.util.Arrays;

public class InsertionSort {
public static void insertionSort(int number[]){
    for(int i=1;i<number.length;i++){
        int j=i;
        while (j>0 && number[j]<number[j-1]) {
            int temp=number[j];
            number[j]=number[j-1];
            number[j-1]=temp;
            j--; 
        }
    }
}

    public static void main(String[] args) {
        int number[] = { 23, 43, 12, 87, 54, 67, 2, 8 };
        insertionSort(number);
        System.out.println(Arrays.toString(number));
    }
}
