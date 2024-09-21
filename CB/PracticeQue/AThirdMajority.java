import java.util.Arrays;
import java.util.Scanner;
public class AThirdMajority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] votes = new int[n];
        for (int i = 0; i < n; i++) {
            votes[i] = sc.nextInt();
        }
        sc.close();
        findRepresentatives(votes);
    }
    private static void findRepresentatives(int[] votes) {
        Arrays.sort(votes);
        int count = 1;
        int threshold = votes.length / 3;
        for (int i = 1; i < votes.length; i++) {
            if (votes[i] == votes[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > threshold) {
                System.out.println(votes[i]);
            }
        }
    }
}
