import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,9,3,7,5,4,2};
        for(int i=1;i<=arr.length-1;i++){
            int val = arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
        System.out.println(Arrays.toString(arr));
    }
}
