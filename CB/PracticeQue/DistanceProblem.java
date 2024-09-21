import java.util.Arrays;
import java.util.Scanner;
public class DistanceProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int left = 0;
        int right = nums[n - 1] - nums[0];
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = countPairs(nums, mid);
            if (count >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }
    private static int countPairs(int[] nums, int distance) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            while (j < nums.length && nums[j] - nums[i] <= distance) {
                j++;
            }
            count += j - i - 1;
        }
        return count;
    }
}
