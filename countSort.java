class countSort{

    public static void countSort(int[] arr, int min, int max){

        int range = max-min+1;
        int[] farr = new int[range];

        for(int i=0; i<arr.length; i++){
            int val = arr[i]-min;
            farr[val]++;
        }
        for(int i=1; i<farr.length; i++){
            farr[i] = farr[i] + farr[i-1];
        }

        int[] ans = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            int val = arr[i]-min;
            int pos = farr[val];
            int idx = pos-1;
            ans[idx] = arr[i];
            farr[val]--;
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = ans[i];
        }
    }

    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {9,6,3,5,3,4,3,9,6,4,6,5,8,9,9};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        countSort(arr, min, max);
        display(arr);
    }
}