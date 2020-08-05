//unknown - i to end
//less than pivot -> 0 to j-1
// more than pivot -> j to i-1;

class partioningArray{

    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }

    public static void partioningArray(int[] arr, int pivot){
        int i=0,j=0;

        while(i<arr.length){
            if(arr[i]>pivot){
                i++;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j++;
            }
        }

        display(arr);
    }

    public static void main(String[] args){
        int[] arr = {4,9,7,8,3,6,2,1};
        int pivot = 5;
        partioningArray(arr, pivot);
    }
}