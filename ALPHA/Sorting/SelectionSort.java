import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //In SelectionSort pick the smallest put it at th beginning.
        int[] arr = {5,4,1,3,2};
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]
    }
}
