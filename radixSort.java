class radixSort{

    public static void radixSort(int[] arr){

        int max = Integer.MIN_VALUE;
        for(int val: arr){
            if(val>max){
                max = val;
            }
        }

        int exp =1;
        while(exp<=max){
            count(arr, exp);
            exp = exp*10;
        }
    }

    public static void count(int[] arr, int exp){
        int[] ans = new int[arr.length];

        int[] farr = new int[10];

        for(int i=0; i<arr.length; i++){
            int val = (arr[i]/exp)%10;
            farr[val]++;
        }

        for(int i=1; i<farr.length; i++){
            farr[i] += farr[i-1];
        }

        for(int i=arr.length-1; i>=0; i--){
            int val = (arr[i]/exp)%10;
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
        }System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {213,97,718,123,37,443,982,64,375,683};

        radixSort(arr);
        display(arr);
    }
}