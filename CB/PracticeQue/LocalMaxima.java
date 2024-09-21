import java.util.Scanner;

public class LocalMaxima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println(findLocalMaxima(A, 0, N - 1));
        scanner.close();
    }

    private static int findLocalMaxima(int[] A, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (A[mid] > A[mid + 1] && A[mid] > A[mid - 1]) {
                return mid;
            } else if (A[mid] > A[mid + 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
