import java.util.*;

class bubbleSort{
    
    public static void main(String[] args) {
        int [] arr = {2,0,6,5,8,9,3,1};

        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean isSort = true;
            for(int j=0; j<n-1-i; j++ ){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSort = false;
                }
            }if(isSort){
                break;
            }
        }for(int val: arr){
            System.out.print(val + " ");
        }System.out.println();
        
    }
}