import java.util.*;

public class selectionSort{
    public static void main(String [] args){
        int [] arr = {2,0,6,5,8,9,3,1};

        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int minIdx = i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        for(int val: arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}