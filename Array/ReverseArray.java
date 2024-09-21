import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        int k = arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k--] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
