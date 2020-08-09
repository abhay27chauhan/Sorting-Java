// time complexity O(n);
// find kth smallest element;

import java.util.Scanner;
class quickSelect{

    public static int quickSelect(int[] arr, int idx, int lo, int hi){

        int pivot = arr[hi];
        int pi = partition(arr, pivot, lo, hi);
        if(idx == pi){
            return arr[pi];
        }else if(idx<pi){
            return quickSelect(arr, idx, lo, pi-1);
        }else{
            return quickSelect(arr, idx, pi+1, hi);
        }
        
    }

    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }

    public static int partition(int[] arr, int pivot, int lo, int hi){
        int i=lo, j=lo;
        while(i<=hi){
            if(arr[i]>pivot){
                i++;
            }else{
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                i++;
                j++;
            }
        }
        return j-1;
    }

    public static void main(String[] args){
        int[] arr = {8,5,1,3,7,2,9,6};
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int sele = quickSelect(arr, k-1, 0, arr.length-1);
        System.out.println(sele);
    }
}