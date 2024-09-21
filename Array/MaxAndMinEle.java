import java.util.Arrays;

public class MaxAndMinEle {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5};
        Arrays.sort(arr);
        System.out.println("Min Ele: "+arr[0]);
        System.out.println("Max Ele: "+arr[arr.length-1]);
    }
}
