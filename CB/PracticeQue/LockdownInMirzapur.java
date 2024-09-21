import java.util.Scanner;

public class LockdownInMirzapur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int R = scanner.nextInt();
            long result = calculateWays(N, R);
            System.out.println(result);
        }
        scanner.close();
    }
    private static long calculateWays(int N, int R) {
        return factorial(N) / (factorial(R) * factorial(N - R));
    }
    private static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
