/*
Given an array A of non-negative integers, return an array consisting of all the even elements of A, 
followed by all the odd elements of A.
*/

class Solution {
    
    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    
    public int[] sortArrayByParity(int[] A) {
        if(A.length == 1) return A;
        
        int i=0;
        int j=0;
        
        while(i<A.length){
            if(A[i]%2 == 1){
                i++;
            }else{
                swap(A, i, j);
                i++;
                j++;
            }
        }
        
        return A;
    }
}
