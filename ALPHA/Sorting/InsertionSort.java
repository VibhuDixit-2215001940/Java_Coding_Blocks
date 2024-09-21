import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        //Pick an element and place in the right pos in sorted part
        int[] arr = {5,4,1,3,2};
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            //Finding out the correct position to insert
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]
    }
}
