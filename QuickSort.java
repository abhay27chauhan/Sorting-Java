class QuickSort{

    public static void QuickSort(int[] arr, int lo, int hi){
        if(lo >= hi){
            return;
        }
        int pivot = arr[hi];
        int pidx = partition(arr, lo, hi, pivot);
        QuickSort(arr, lo, pidx-1);
        QuickSort(arr, pidx+1, hi);
    }

    public static int partition(int[] arr, int lo, int hi, int pivot){
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

    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {8,5,1,3,7,2,9,6};

        QuickSort(arr, 0, arr.length-1);
        display(arr);
    }
}