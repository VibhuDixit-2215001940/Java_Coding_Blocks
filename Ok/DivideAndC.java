import java.util.Arrays;

public class DivideAndC {
    public static void main(String[] args) {
        //Given an array of integers you have to sort Using Merge Sort
        int[] arr = { 5, 7, 2, 3, 8, 9, 1, 4 };
        Sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] Sort(int[] arr, int si, int ei) {
        if(si==ei){
            int[] bs = new int[1];
            bs[0] = arr[si];
            return bs;
        }
        int mid = (si + ei)/2;
        int[] f = Sort(arr,si,mid);
        int[] s = Sort(arr,mid+1,ei);
        return merge(f,s);
    }
    public static int[] merge(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                ans[k++] = nums1[i++];
            }
            else{
                ans[k++] = nums2[j++];
            }
        }
        while(i<nums1.length){
            ans[k++] = nums1[i++];
        }
        while(j<nums2.length){
            ans[k++] = nums2[j++];
        }
        return ans;
    }
}
