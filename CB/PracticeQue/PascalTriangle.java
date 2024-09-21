import java.util.Scanner;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // if (N <= 0 || N >= 100) {
        //     System.out.println("Invalid input. Please enter a value between 0 and 100.");
        //     return;
        // }
        printPascalsTriangle(N);
    }
    static void printPascalsTriangle(int N) {
        for (int i = 0; i < N; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "\t");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
