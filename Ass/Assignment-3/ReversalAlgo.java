public class ReversalAlgo {
     public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7};
       int k = 3;
       Rotate_Array(arr, k);
       for(int i=0;i<arr.length;i++){
        arr[i+1] = arr[i];
       }
    }
    public static void Rotate_Array(int[] arr,int k){
        int n = arr.length;
        k = k % n;
        Reverse(arr,0,n-k-1);//First n-k elemenet
        Reverse(arr,n-k,n-1);   //Last k elemenet
        Reverse(arr,n,n-1);     //All element
    }
    public static void Reverse(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
