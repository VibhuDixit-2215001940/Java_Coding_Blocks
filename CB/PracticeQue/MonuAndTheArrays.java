import java.util.Arrays;
import java.util.Scanner;
public class MonuAndTheArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int[] A = new int[n1];
        int[] B = new int[n2];
        int[] C = new int[n3];
        for (int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < n3; i++) {
            C[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        sc.close();
        int minAbsoluteDifference = Integer.MAX_VALUE;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n3; k++) {
                    int currentAbsoluteDifference = Math.abs(Math.max(A[i], Math.max(B[j], C[k])) - Math.min(A[i], Math.min(B[j], C[k])));
                    minAbsoluteDifference = Math.min(minAbsoluteDifference, currentAbsoluteDifference);
                }
            }
        }
        System.out.println(minAbsoluteDifference);
    }
}
