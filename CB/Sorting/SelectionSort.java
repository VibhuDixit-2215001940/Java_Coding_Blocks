import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,5,8,3,2,9};
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 5, 8, 9]
    }
}
