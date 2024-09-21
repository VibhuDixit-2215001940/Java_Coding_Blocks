import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int first = 0, second = 1, result = 0;

        for (int i = 2; i <= N; i++) {
            result = first + second;
            first = second;
            second = result;
        }

        System.out.println(result);
    }
}
