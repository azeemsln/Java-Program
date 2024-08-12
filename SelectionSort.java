import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int []number){
        for(int i=0;i<number.length;i++){
            int min_idx=i;
            for(int j=i+1;j<number.length;j++){
                if(number[j]<number[min_idx]){
                    min_idx=j;
                }
            }
            int temp=number[min_idx];
            number[min_idx]=number[i];
            number[i]=temp;
        }
    }
    public static void main(String[] args) {
        int number[] = { 1,23, 43, 12, 87, 54, 67, 2, 8 };
        selectionSort(number);
        
        System.out.println(Arrays.toString(number));
    }
}
