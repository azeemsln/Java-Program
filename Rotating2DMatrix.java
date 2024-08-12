import java.util.*;
public class Rotating2DMatrix {
    public static void main(String[] args) {
        int [][]arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int m=arr.length;
        int n=arr[0].length;
        int[][] arr1=new int[m][n];
        System.out.println("Given Array : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr1[i][j]=arr[j][i];
            }
        }
        
        System.out.println("After Rotating 90 degree: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=arr1[0].length-1;j>=0;j--){
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }
        
    }
}
