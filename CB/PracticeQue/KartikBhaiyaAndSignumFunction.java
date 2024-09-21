import java.util.Scanner;
public class KartikBhaiyaAndSignumFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        long product = calculateProduct(array);
        int signum = findSignum(product);
        System.out.println(signum);
    }
    private static long calculateProduct(int[] array) {
        long product = 1;
        for (int num : array) {
            product *= num;
        }
        return product;
    }
    private static int findSignum(long num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
