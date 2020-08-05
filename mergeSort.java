class mergeSort{

    public static int[] mergeSort(int[] arr, int lo, int hi){
        if(lo==hi){
            int[] bres = new int[1];
            bres[0] = arr[lo];
            return bres;
        }

        int mid = (lo+hi)/2;
        int[] lsorted = mergeSort(arr, lo, mid);
        int[] rsorted = mergeSort(arr, mid+1, hi);

        int[] sortedArr = merge2SortedArrays(lsorted, rsorted);

        return sortedArr;
    }

    public static int[] merge2SortedArrays(int[] a, int[] b){
        int[] sa = new int[a.length+b.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                sa[k] = a[i];
                i++;
                k++;
            }else{
                sa[k] = b[j];
                j++;
                k++;
            }
        }

        while(i<a.length){
            sa[k] = a[i];
            i++;
            k++;
        }

        while(j<b.length){
            sa[k] = b[j];
            j++;
            k++;
        }

        return sa;
    }

    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }

    public static void main(String[] args){
        int[] arr ={7,4,1,3,6,8,2,5};

        int[] sortedArr = mergeSort(arr, 0, arr.length-1);
        display(sortedArr);
    }
}