class sort012{

    public static void sort012(int[] arr){
        int i=0, j=0;
        int k =arr.length-1;

        while(i<=k){
            if(arr[i] == 2){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;

                k--;
            }else if(arr[i] == 1){
                i++;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j++;
            }
        }
    }

    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {1,1,2,2,0,1,2,2,1,0,1,2,0,2,1};

        sort012(arr);
        display(arr);
    }
}