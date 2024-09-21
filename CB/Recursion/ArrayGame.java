import java.util.Scanner;
public class ArrayGame {
    static int maxPoints(int[] arr, int start, int end) {
        if (start >= end) 
            return 0;
        int leftSum = 0, rightSum, maxScore = 0;
        for (int i = start; i < end; i++) {
            leftSum += arr[i];
            rightSum = 0;
            for (int j = i + 1; j <= end; j++) {
                rightSum += arr[j];
                if (leftSum == rightSum) {
                    int leftScore = maxPoints(arr, start, i);
                    int rightScore = maxPoints(arr, j, end);
                    maxScore = Math.max(maxScore, 1 + leftScore + rightScore);
                }
            }
        }
        return maxScore;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(maxPoints(arr, 0, n - 1));
        }
        sc.close();
    }
}
