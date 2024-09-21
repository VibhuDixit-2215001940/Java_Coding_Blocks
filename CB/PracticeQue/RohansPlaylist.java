import java.util.Scanner;

public class RohansPlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] cumulativeTime = new long[n];
        for (int i = 0; i < n; i++) {
            int ci = sc.nextInt();
            int ti = sc.nextInt();
            if (i == 0) {
                cumulativeTime[i] = ci * ti;
            } else {
                cumulativeTime[i] = cumulativeTime[i - 1] + ci * ti;
            }
        }
        int[] moments = new int[m];
        for (int i = 0; i < m; i++) {
            moments[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int moment = moments[i];
            int songNumber = binarySearch(cumulativeTime, moment);
            System.out.print(songNumber + " ");
        }
    }
    private static int binarySearch(long[] cumulativeTime, int moment) {
        int low = 0, high = cumulativeTime.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (cumulativeTime[mid] < moment) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low + 1;
    }
}
