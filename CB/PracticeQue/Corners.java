import java.util.Scanner;
public class Corners {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] redirections = new int[N];
        for (int i = 0; i < N; i++) {
            redirections[i] = sc.nextInt();
        }
        sc.close();
        int maxLength = findLongestLoopLength(redirections);
        System.out.println(maxLength);
    }
    private static int findLongestLoopLength(int[] redirections) {
        int n = redirections.length;
        boolean[] visited = new boolean[n];
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int current = i;
                int length = 0;
                while (!visited[current]) {
                    visited[current] = true;
                    current = redirections[current];
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
