import java.util.*;

public class insertionSort{

    public static void main(String[] args){
        int [] arr = {2,0,6,5,8,9,3,1};

        int n = arr.length;
        int jc = 1;
        while(jc<=n-1){
            for(int i = jc; i>0; i--){
                if(arr[i]<arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }else{
                    break;
                }
            } jc++;
        }for(int val: arr){
            System.out.print(val + " ");
        }System.out.println();
    }
}