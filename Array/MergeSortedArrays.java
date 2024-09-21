import java.util.Arrays;

public class MergeSortedArrays{
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4, 5};
        int arr2[] = {2, 4, 6, 8};
        merge(arr1,arr2);
    }
    public static void merge(int[] arr1,int[] arr2){
        int arr3[] = new int[arr1.length+arr2.length];
        for(int i=0;i<arr3.length;i++){
            if(i<arr1.length){
                arr3[i] = arr1[i];
            }
            else{
                arr3[i] = arr2[i-arr1.length];
            }
        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}