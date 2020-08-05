class merge2SortedArray{

    public static int[] merge2SortedArray(int[] a, int[] b){
        int[] sa = new int[a.length+b.length];

        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                sa[k] = a[i];
                i++;
                k++;
            }else{
                sa[k] = b[j];
                j++;
                k++;
            }
        }

        while(i<a.length){
            sa[k] = a[i];
            i++;
            k++;
        }

        while(j<b.length){
            sa[k] = b[j];
            j++;
            k++;
        }

        return sa;
    }

    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }

    public static void main(String[] args){
        int[] a = {2,5,12,18,20};
        int[] b = {7,9,11,15,25,28,30,35};

        int[] res = merge2SortedArray(a,b);
        display(res);
    }
}