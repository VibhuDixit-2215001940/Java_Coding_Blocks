import java.util.Arrays;

public class ArraysPartitions {
    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        int[] nums1 = {1,4,3,2};
        System.out.println(arrayPairSum(nums));//9
        System.out.println(arrayPairSum1(nums1));//4
    }
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));//[1, 2, 2, 5, 6, 6]
        int sum = 0;

        for(int i=0; i<nums.length; i+=2){
            System.out.print(nums[i]+" ");//1 2 6
            sum+=nums[i];
            // System.out.println(""+nums[i]);
        }
        System.out.println();
        return sum;
    }
    public static int arrayPairSum1(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));//[1,2,3,4]
        int sum = 0;

        for(int i=0; i<nums.length; i+=2){
            System.out.print(nums[i]+" ");//1 3
            sum+=nums[i];
            // System.out.println(""+nums[i]);
        }
        System.out.println();
        return sum;
    }
}
