import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        for(int i=0;i<m;i++){
            nums1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        for(int i=0;i<n;i++){
            nums2[i] = sc.nextInt();
        }
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        for(int i=0;i<(m);i++){
            if(nums1[i]!=0){
                arr[i] = nums1[m-i-1];
            }
        }
        for(int i=0;i<(n);i++){
            if(nums2[i]!=0){
                arr[m+i] = nums2[n-i-1];
            }
            else{
                
            }
        }
        Arrays.sort(arr,0,(m+n));
        System.out.print(Arrays.toString(arr));
    }
}
