import java.util.Scanner;
public class KebsParticle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        long[] arr1 = new long[t];
        long mul = 1;
        for (int i = 0; i < t; i++) {
            mul *= arr[i];
        }
        for (int i = 0; i < t; i++) {
            arr1[i] = mul / arr[i];
            System.out.print(arr1[i] + " ");
        }
    }
}
