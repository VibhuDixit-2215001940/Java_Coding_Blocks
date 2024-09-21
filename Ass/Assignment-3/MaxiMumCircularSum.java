import java.util.Scanner;

public class MaxiMumCircularSum {
   public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    for (int r = 0; r < t; r++) {
        int u = s.nextInt();
        int[] y = new int[u];

        for (int i = 0; i < u; i++) {
            y[i] = s.nextInt();
        }

        int l = 0;
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        int c = 0;
        int m = 0;
        
        for (int n : y) {
            l += n;
            c = Math.max(c + n, n);
            a = Math.max(a, c);
            m = Math.min(m + n, n);
            b = Math.min(b, m);
        }

        int g = l - b;
        if (a < 0) {
            System.out.println(a);
        } else {
            System.out.println(Math.max(a, g));
        }
    }
} 
}
