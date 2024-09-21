import java.util.Arrays;
import java.util.Scanner;

public class PairRose_Dup {
    public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        while (a > 0) {
            int b = s.nextInt();
            long[] c = new long[b];
            for (int d = 0; d < b; d++) {
                c[d] = s.nextLong();
            }
            int e = s.nextInt();
            Arrays.sort(c);
            int f = 0, g = b - 1;
            int h = 0, i = 0;
            int j = 10000;
            while (f < g) {
                long k = c[f] + c[g];
                if (k == e) {
                    int l = (int) (c[g] - c[f]);
                    if (j >= l) {
                        h = f;
                        i = g;
                        j = l;
                    }
                    f++;
                    g--;
                } else if (k < e) {
                    f++;
                } else {
                    g--;
                }
            }
            System.out.println("Deepak should buy roses whose prices are " + c[h] + " and " + c[i] + ".");
            a--;
        }
        s.close();
    }
}

}
