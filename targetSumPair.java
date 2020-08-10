import java.util.Arrays;
class targetSumPair{

    public static void targetSumPair(int[] arr, int target){
        Arrays.sort(arr);
        int i=0, j=arr.length-1;

        while(i<j){
            if(arr[i] + arr[j] < target){
                i++;
            }else if(arr[i] + arr[j] > target){
                j--;
            }else{
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {7,15,3,18,6,4,19,2,12,11,9};

        targetSumPair(arr, 15);
    }
}