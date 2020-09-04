class sortDates{

    public static void sortDates(String[] dates){
        countSort(dates, 1000000, 100, 32);
        countSort(dates, 10000, 100, 13);
        countSort(dates, 1, 10000, 2501);
    }

    public static void countSort(String[] arr, int div, int mod, int range){
        String[] ans = new String[arr.length];

        int[] farr = new int[range];

        for(int i=0; i<arr.length; i++){
            int val = (Integer.parseInt(arr[i],10)/div%mod);
            farr[val]++;
        }

        for(int i=1; i<farr.length; i++){
            farr[i] = farr[i] + farr[i-1];
        }

        for(int i=arr.length-1; i>=0; i--){
            int val = (Integer.parseInt(arr[i],10)/div%mod);
            int idx = farr[val]-1;
            ans[idx] = arr[i];
            farr[val]--;
        }

        for(int i=0; i<arr.length; i++){
            arr[i] = ans[i];
        }
    }

    public static void display(String[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }

    public static void main(String[] args){
        String[] dates = {"12041996","20101996","05061997","12041989","11081987"};
        sortDates(dates);
        display(dates);

    }
}