import java.util.Arrays;
import java.util.Scanner;
public class CoronaItalyHelp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int time = 0;
        for (int i = 1; i <= N; i++) {
            int maxTime = 0;
            for (int j = 0; j < M; j++) {
                maxTime = Math.max(maxTime, arr[j] * i);
            }
            time += maxTime;
        }
        System.out.println(time);
        sc.close();
    }
}
