import java.util.*;

public class PrintSequenceArray {
    public static void printSequence(int[] arr,int index,ArrayList<Integer> tempArr){
        if(index==arr.length){
            // print the subsequence of the array But dont print the empty entries
            if(tempArr.size()>0){
                System.out.print(tempArr);
            }
            return;
        }
        // recursive call

        // include
        printSequence(arr, index+1, tempArr);
        
        // add the value in temArr
        tempArr.add(arr[index]);

        // do not include
        printSequence(arr, index+1, tempArr);
        tempArr.remove(tempArr.size()-1);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,};
        // printSequence(arr,index)
        System.out.println("For the array - "+ Arrays.toString(arr));
        printSequence(arr, 0, new ArrayList<>());
    }
}
