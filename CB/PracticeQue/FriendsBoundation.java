import java.util.Arrays;
import java.util.Scanner;
public class FriendsBoundation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int totalRequests = countFriendRequests(arr);
        System.out.println(totalRequests);
        sc.close();
    }
    private static int countFriendRequests(int[] ages) {
        int totalRequests = 0;
        for (int i = ages.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (ages[j] > 0.5 * ages[i] + 7) {
                    totalRequests += i - j;
                } else {
                    break;
                }
            }
        }
        return totalRequests;
    }
}
