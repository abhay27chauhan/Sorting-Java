class insertionSort2{

    public static void main(String[] args){
        int [] arr = {2,0,6,5,9,8,3,1};
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i; j>=0; j--){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }else{
                    break;
                }
            }
        }
        for(int a : arr){
            System.out.print(a + " ");
        }
         System.out.println();
    }
}