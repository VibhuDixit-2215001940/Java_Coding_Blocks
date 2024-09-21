import java.util.Scanner;
public class HelpAdarsh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        long result = sumOfMinInSubarrays(arr);
        System.out.println(result % 1000000007);
    }
    private static long sumOfMinInSubarrays(int[] arr) {
        int n = arr.length;
        long result = 0;
        int MOD = 1000000007;
        for (int i = 0; i < n; i++) {
            int left = i - 1;
            while (left >= 0 && arr[left] >= arr[i]) {
                left--;
            }
            int right = i + 1;
            while (right < n && arr[right] >= arr[i]) {
                right++;
            }
            result = (result + (long) arr[i] * (i - left) * (right - i)) % MOD;
        }
        return result;
    }
}
