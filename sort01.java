class sort01{

    public static void sort01(int[] arr){
        int i=0, j=0;

        while(i<arr.length){
            if(arr[i] == 1){
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
        int[] arr = {1,1,0,1,0,1,1,0,1,0,0,0,1};

        sort01(arr);
        display(arr);
    }
}