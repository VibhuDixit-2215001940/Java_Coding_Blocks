import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for(int i=0;i<t;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(thirdMax(arr));
    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[3];
        int count = 1;
        arr[0] = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < arr[count - 1]) {
                arr[count] = nums[i];
                count++;
            }
            if (count == 3) {
                break;
            }
        }

        if (count < 3) {
            return arr[0];  
        } else {
            return arr[2];  
        }
    }
}
