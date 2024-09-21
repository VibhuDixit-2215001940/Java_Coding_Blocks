import java.util.ArrayList;
import java.util.Scanner;
public class MazePath {
    public static int countPaths(int N, int M) {
        if (N == 1 || M == 1) {
            return 1;
        }
        return countPaths(N - 1, M) + countPaths(N, M - 1);
    }
    public static ArrayList<String> findPaths(int N, int M, String path, int row, int col) {
        if (row == N - 1 && col == M - 1) {
            ArrayList<String> result = new ArrayList<>();
            result.add(path);
            return result;
        }
        ArrayList<String> paths = new ArrayList<>();
        if (row < N - 1) {
            paths.addAll(findPaths(N, M, path + "V", row + 1, col));
        }
        if (col < M - 1) {
            paths.addAll(findPaths(N, M, path + "H", row, col + 1));
        }
        return paths;
    }
    public static void printPaths(int N, int M, String path, int row, int col) {
        if (row == N - 1 && col == M - 1) {
            System.out.print(path + " ");
            return;
        }
        if (row < N - 1) {
            printPaths(N, M, path + "V", row + 1, col);
        }
        if (col < M - 1) {
            printPaths(N, M, path + "H", row, col + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        int count = countPaths(N, M);
        printPaths(N, M, "", 0, 0);
        System.out.println();
        System.out.println(count);
    }
}
