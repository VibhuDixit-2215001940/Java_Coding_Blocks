import java.util.Arrays;
import java.util.Scanner;

public class PearanceParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int maxCharm = 0;
        for (int i = 0; i < t; i += 2) {
            maxCharm += arr[i];
        }
        System.out.println(maxCharm);
    }
}

