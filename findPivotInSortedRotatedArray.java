class findPivotInSortedRotatedArray{

    public static int findPivot(int[] arr, int lo, int hi){

        while(lo<hi){
            int mid = (lo+hi)/2;
            if(arr[mid]< arr[hi]){
                hi = mid;
            }else{
                lo = mid + 1;
            }
        }
        return arr[hi];
    }

    public static void main(String[] args) {
        int[] arr = {30,40,50,10,20};
        int pivot = findPivot(arr, 0, arr.length-1);
        System.out.println(pivot);
    }
}