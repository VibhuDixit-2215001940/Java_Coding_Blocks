//35. Search Insert Position
// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = searchInsert(nums,target);
        System.out.println(ans);
        sc.close();
    }
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index = i;
            }
            else if(nums[i]<target){
                index = i+1;
            }
        }
        return index;
    }
}
