import java.util.Scanner;
public class CookiePiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int D = sc.nextInt();
            int totalCookies = calculateTotalCookies(N, A, D);
            System.out.println(totalCookies);
        }
        sc.close();
    }
    public static int calculateTotalCookies(int N, int A, int D) {
        // The sum of an arithmetic series formula: sum = N/2 * (2*A + (N-1)*D)
        return N * A + (N * (N - 1) / 2) * D;
    }
}
